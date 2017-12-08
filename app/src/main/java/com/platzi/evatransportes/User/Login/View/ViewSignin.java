package com.platzi.evatransportes.User.Login.View;

/**
 * Created by trini on 31/10/17.
 */

public interface ViewSignin {
    void enableControls();
    void disableControls();
    void showError(String message);
    void successConductor();
    void successTransportista();
    void successCliente();

}
