package com.platzi.evatransportes.User.Login.Interactor;

import com.platzi.evatransportes.User.Login.Presenter.PresenterInterLogin;
import com.platzi.evatransportes.User.Login.Repository.RepositoryInterLogin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by trini on 31/10/17.
 */

public class InteractorClassLogin implements InteractorInterLogin{

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    @Override
    public void login(String email, String password) {
        if(validar(email,password)){
            repository.login(email,password);
        }
    }

    private PresenterInterLogin presenter;
    private RepositoryInterLogin repository;

    public InteractorClassLogin(PresenterInterLogin presenter, RepositoryInterLogin repository) {
        this.presenter = presenter;
        this.repository = repository;
    }


    public boolean validar(String email , String password)  {

        if (!validateEmail(email)) {
            presenter.error("Usuario no Valido");
            return false;
        } else if (!validatePassword(password)) {
            presenter.error("Contraseña no Valida!");
            return  false;
        } else {
            return true;
        }
    }

    public boolean validateEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        return password.length() > 5;
    }



}
