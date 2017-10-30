package com.platzi.evatransportes;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.platzi.evatransportes.Fragments.ConductorUserFragment;
import com.platzi.evatransportes.Fragments.ViajesConductorFragment;

public class ConductorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor);
      // showToolbar(getResources().getString(R.string.title_Conductor),false);
         ConductorUserFragment listaViajesFragment = new ConductorUserFragment();
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
