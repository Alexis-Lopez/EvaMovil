package com.platzi.evatransportes.User.Login.Repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.platzi.evatransportes.Model.Usuario;
import com.platzi.evatransportes.ModelWS.App;
import com.platzi.evatransportes.ModelWS.CurrentUser;
import com.platzi.evatransportes.ModelWS.ErrorApi;
import com.platzi.evatransportes.ModelWS.HttpRequestLogin;
import com.platzi.evatransportes.User.Login.Presenter.PresenterInterLogin;
import com.platzi.evatransportes.WebServices.Connect;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by trini on 31/10/17.
 */

public class RepositoryClassLogin {

    /*private PresenterInterLogin presenter;
    private Connect connect;


   public RepositoryClassLogin(PresenterInterLogin presenter) {
        this.presenter = presenter;
        connect = new Connect(App.getInstance().getContext());
    }


    @Override
    public void login(final String email, String password) {

        Call<Usuario> call = connect.gerWS().login(new HttpRequestLogin(email, password));
        call.enqueue(new Callback<Usuario>() {

            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {

                if (response.isSuccessful()) {

                    CurrentUser.setPreferences(
                            response.body().getRol(),
                            response.body().getAuthentication(),
                            response.body().getEmail());


                    if (CurrentUser.getRol().equals("Transportista")) {
                        presenter.successTransportista();
                    } else if (CurrentUser.getRol().equals("Conductor")) {
                        presenter.successConductor();
                    } else if (CurrentUser.getRol().equals("Cliente")) {
                        presenter.successCliente();
                    }

                }
                else{
                    try {
                        ErrorApi error = new ErrorApi();
                        Gson gson = new GsonBuilder().create();
                        error = gson.fromJson(response.errorBody().string(), ErrorApi.class);
                        presenter.error(error.getMessage());
                    } catch (IOException e) {
                        presenter.error(e.getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                presenter.error(t.getMessage());

            }

        });
    }*/
}


