package com.platzi.evatransportes.User.Login.View;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.platzi.evatransportes.ClienteActivity;
import com.platzi.evatransportes.ConductorActivity;
import com.platzi.evatransportes.Model.Conductor;
import com.platzi.evatransportes.Model.Usuario;
import com.platzi.evatransportes.ModelWS.App;
import com.platzi.evatransportes.ModelWS.CurrentUser;
import com.platzi.evatransportes.ModelWS.HttpRequestLogin;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.TransportistaActivity;
import com.platzi.evatransportes.ViajesActivity;
import com.platzi.evatransportes.WebServices.Connect;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void usuarios(final View view){
        TextInputEditText tvUser = (TextInputEditText) findViewById(R.id.Username);
        TextInputEditText tvPassword = (TextInputEditText) findViewById(R.id.Password);

        String User,pass;

        User = tvUser.getText().toString().trim();
        pass = tvPassword.getText().toString().trim();

        HttpRequestLogin lr = new HttpRequestLogin(User, pass);
        Call api = Connect.getConnectWS().login(lr);
        api.enqueue(new Callback<Usuario>() {
                        @Override
                        public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                            if (response.isSuccessful()) {

                                CurrentUser.setPreferences(
                                        response.body().getRol(),
                                        response.body().getAuthentication(),
                                        response.body().getEmail()
                                );

                                if (CurrentUser.getRol().equals("Conductor")) {
                                    Intent intent = new Intent(getBaseContext(), ConductorActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else if (CurrentUser.getRol().equals("Cliente")) {
                                    Intent intent = new Intent(getBaseContext(), ClienteActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else if (CurrentUser.getRol().equals("Transportista")) {
                                    Intent intent = new Intent(getBaseContext(), TransportistaActivity.class);
                                    startActivity(intent);
                                }
                            }
                            else {
                                Toast.makeText(getBaseContext(), "El usuario o la contraseña esta equivocada  ", Toast.LENGTH_SHORT).show();


                            }
                        }
            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                Log.e("ERROR",t.getMessage());
                Toast.makeText(App.getContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
             });
    }
}






   /* @Override
    public void successConductor() {
        Intent intent = new Intent(this, ConductorActivity.class);
        startActivity(intent);
    }

    @Override
    public void successTransportista() {
        Intent intent = new Intent(this,ClienteActivity.class);
        startActivity(intent);

    }

    @Override
    public void successCliente() {
        Intent intent = new Intent(this,TransportistaActivity.class);
        startActivity(intent);
    }


    @Override
    public void enableControls() {

    }

    @Override
    public void disableControls() {

    }

    @Override
    public void showError(String message) {

    }*/

