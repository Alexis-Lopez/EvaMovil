package com.platzi.evatransportes;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.platzi.evatransportes.Fracments.ViajesConductorFragment;
import com.platzi.evatransportes.R;

public class ConductorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor);
      // showToolbar(getResources().getString(R.string.title_Conductor),false);
        ViajesConductorFragment listaViajesFragment = new ViajesConductorFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content,listaViajesFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
    }

   /* public void showToolbar(String title,boolean upButton){
        Toolbar toolbar = (Toolbar)  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }*/


}
