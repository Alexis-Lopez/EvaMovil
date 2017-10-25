package com.platzi.evatransportes.View;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.platzi.evatransportes.Adapters.AdapterItemDetails;
import com.platzi.evatransportes.Adapters.ViajeConductorRecyclerView;
import com.platzi.evatransportes.Model.ItemDetails;
import com.platzi.evatransportes.Model.Viaje;
import com.platzi.evatransportes.R;

import java.util.ArrayList;

public class DetailsConductActivity extends Activity {

    private View v;
    private RecyclerView details;
    private AdapterItemDetails mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_conduct);

        details = (RecyclerView) findViewById(R.id.detalleViaje);
        mAdapter = new AdapterItemDetails(buildText());
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(getApplicationContext());
        details.setLayoutManager(mLayout);
        details.setItemAnimator(new DefaultItemAnimator());
        details.setAdapter(mAdapter);
    }


    public ArrayList<ItemDetails> buildText(){
        ArrayList<ItemDetails> item = new ArrayList<>();
        item.add(new ItemDetails("Chiapas","Precaucion"));
        item.add(new ItemDetails("Saltillo","Pesado"));
        item.add(new ItemDetails("San Luis Potosi","Delicado"));
        item.add(new ItemDetails("Camargo","Precaucion"));

        return item;
    }
}
