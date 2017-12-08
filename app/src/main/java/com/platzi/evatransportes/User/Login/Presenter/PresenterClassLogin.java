package com.platzi.evatransportes.User.Login.Presenter;

import android.view.View;

import com.platzi.evatransportes.User.Login.Interactor.InteractorClassLogin;
import com.platzi.evatransportes.User.Login.Interactor.InteractorInterLogin;
import com.platzi.evatransportes.User.Login.View.ViewSignin;

/**
 * Created by trini on 31/10/17.
 */

public class PresenterClassLogin implements PresenterInterLogin{

    private ViewSignin view;
    private InteractorInterLogin interactorInterLogin;


    public PresenterClassLogin(ViewSignin view, InteractorInterLogin interactorInterLogin) {
        this.view = view;
        this.interactorInterLogin = interactorInterLogin;
    }



    @Override
    public void signIn(String email, String password) {

    }

    @Override
    public void successConductor() {
        view.successConductor();
    }

    @Override
    public void successTransportista() {
        view.successTransportista();
    }

    @Override
    public void successCliente() {
        view.successCliente();
    }

    @Override
    public void error(String message) {

    }
}
