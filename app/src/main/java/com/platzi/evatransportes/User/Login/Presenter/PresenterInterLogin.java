package com.platzi.evatransportes.User.Login.Presenter;

/**
 * Created by trini on 31/10/17.
 */

public interface PresenterInterLogin {

        void signIn(String email , String password);
        void successConductor();
        void successTransportista();
        void successCliente();
        void error(String message);


}
