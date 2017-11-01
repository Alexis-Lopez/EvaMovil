package com.platzi.evatransportes.View;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.platzi.evatransportes.ClienteActivity;
import com.platzi.evatransportes.ConductorActivity;
import com.platzi.evatransportes.Model.Conductor;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.TransportistaActivity;
import com.platzi.evatransportes.ViajesActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void usuarios(View view){
        TextInputEditText tvUser = (TextInputEditText) findViewById(R.id.Username);
        TextInputEditText tvPassword = (TextInputEditText) findViewById(R.id.Password);

        String User,pass;

        User = tvUser.getText().toString().trim();
        pass = tvPassword.getText().toString().trim();

        if (User.compareTo("conductor@hotmail.com") == 0 && pass.compareTo("123456")==0){
                Intent intent = new Intent(this, ConductorActivity.class);
                startActivity(intent);
        }
        else if(User.compareTo("cliente@hotmail.com")==0 && pass.compareTo("123456")==0){
                Intent intent = new Intent(this,ClienteActivity.class);
                startActivity(intent);
        }else if(User.compareTo("transportista@hotmail.com")==0 && pass.compareTo("123456")==0){
            Intent intent = new Intent(this,TransportistaActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"El usuario o la contraseña esta equivocada  "+User+" "+pass +" ", Toast.LENGTH_SHORT).show();
        }
    }

}
