package com.platzi.evatransportes;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.platzi.evatransportes.Fragments.ViajesClienteFragment;

public class ClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        ViajesClienteFragment viajesClienteFragment= new ViajesClienteFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content,viajesClienteFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
    }
}
