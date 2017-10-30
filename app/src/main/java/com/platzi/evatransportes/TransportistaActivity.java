package com.platzi.evatransportes;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.platzi.evatransportes.Fragments.ClientesFragment;
import com.platzi.evatransportes.Fragments.ConductoresFragment;
import com.platzi.evatransportes.Fragments.NotificationFragment;
import com.platzi.evatransportes.Fragments.ViajesConductorFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class TransportistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportista);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottonbar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.tabs_notification:
                        NotificationFragment notificationFragment = new NotificationFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,notificationFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;

                    case R.id.tabs_clientes:
                        ClientesFragment clientesFragment =  new ClientesFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,clientesFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;

                    case R.id.tabs_viajes:
                        ViajesConductorFragment v =  new ViajesConductorFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,v)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                    case R.id.tabs_conductores:
                        ConductoresFragment conductoresFragment = new ConductoresFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,conductoresFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                }

            }
        });
    }
}
