package com.platzi.evatransportes;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.platzi.evatransportes.Fracments.ConductoresFragment;
import com.platzi.evatransportes.Fracments.NotificationFragment;
import com.platzi.evatransportes.Fracments.ViajesConductorFragment;
import com.platzi.evatransportes.Model.Notificaciones;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;

public class TransportistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportista);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottonbar);
        bottomBar.setDefaultTab(R.id.tabs_notification);

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {

                switch (tabId){
                    case R.id.tabs_notification:
                        NotificationFragment notificationFragment = new NotificationFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,notificationFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;

                    case R.id.tabs_clientes:
                        ViajesConductorFragment viajesConductorFragment =  new ViajesConductorFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,viajesConductorFragment)
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
