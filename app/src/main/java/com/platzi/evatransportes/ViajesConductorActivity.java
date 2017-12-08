package com.platzi.evatransportes;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.platzi.evatransportes.Adapters.AdapterItemDetails;
import com.platzi.evatransportes.Model.ItemDetails;

import java.util.ArrayList;

public class ViajesConductorActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private View v;
    private RecyclerView details;
    private AdapterItemDetails mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viajes_conductor);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng Monterrey= new LatLng(25.6714, -100.309);
        mMap.addMarker(new MarkerOptions().position(Monterrey).title("Monterrey"));


        LatLng NLaredo = new LatLng(27.4762900,-99.5163900);
        mMap.addMarker((new MarkerOptions().position(NLaredo).title("Nuevo Laredo")));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Monterrey.latitude,NLaredo.longitude),6));

        details = (RecyclerView) findViewById(R.id.rvdetalleViaje);
        mAdapter = new AdapterItemDetails(buildText());
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(getApplicationContext());
        details.setLayoutManager(mLayout);
        details.setItemAnimator(new DefaultItemAnimator());
        details.setAdapter(mAdapter);


    }

    public ArrayList<ItemDetails> buildText(){
        ArrayList<ItemDetails> item = new ArrayList<>();
        item.add(new ItemDetails("Nuevo Laredo - Monterrey","Horas planeada : 2.46"));
        item.add(new ItemDetails("Horas planeada","2:46"));
        item.add(new ItemDetails("kms","227"));
        item.add(new ItemDetails("Tipo de Carga :","Delicada"));

        return item;
    }
}
