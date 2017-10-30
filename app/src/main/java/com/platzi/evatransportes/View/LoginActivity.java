package com.platzi.evatransportes.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platzi.evatransportes.ClienteActivity;
import com.platzi.evatransportes.ConductorActivity;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.TransportistaActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarViajesalConductor(View view){
        Intent intent = new Intent(this,ConductorActivity.class);
        startActivity(intent);
    }

    public void mostrarTransportista(View view){
        Intent intent =  new Intent(this, TransportistaActivity.class);
        startActivity(intent);
    }
    public void mostrarViajesCliente(View view){
        Intent intent = new Intent(this, ClienteActivity.class);
        startActivity(intent);
    }

}
