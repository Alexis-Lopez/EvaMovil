package com.platzi.evatransportes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platzi.evatransportes.View.ConductorActivity;

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

}
