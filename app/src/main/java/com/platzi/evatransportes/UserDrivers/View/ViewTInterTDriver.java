package com.platzi.evatransportes.UserDrivers.View;

import com.platzi.evatransportes.Model.ItemDetails;
import com.platzi.evatransportes.Model.TravelsDriver;

import java.util.ArrayList;

/**
 * Created by trini on 28/11/17.
 */

public interface ViewTInterTDriver {

    void showTravelsDriver(ArrayList<TravelsDriver> travels);
    void showDetailsReminders(ArrayList<ItemDetails> items);
    void showError(String message);
    void showProgressBar();
    void hideProgressBar();
    void openPhoneCall(String Number);
    void openMailApp(String mailTo,String subject);
    void showNoTravels();
    void hideNoTravels();


}