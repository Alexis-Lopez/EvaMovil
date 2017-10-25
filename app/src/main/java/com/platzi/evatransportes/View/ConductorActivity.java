package com.platzi.evatransportes.View;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.platzi.evatransportes.Fracments.ListaViajesFragment;
import com.platzi.evatransportes.R;

public class ConductorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor);
      // showToolbar(getResources().getString(R.string.title_Conductor),false);
        ListaViajesFragment listaViajesFragment = new ListaViajesFragment();
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
