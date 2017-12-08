package com.platzi.evatransportes.ModelWS;

import android.app.Application;
import android.content.Context;

/**
 * Created by trini on 31/10/17.
 */

public class App extends Application{

    private static final android.app.Application APP;

    public static android.content.Context getContext() {
        return APP.getApplicationContext();
    }

    static {
        try{
            Class<?> c = Class.forName("android.app.ActivityThread");
            APP = (android.app.Application) c.getDeclaredMethod("currentApplication").invoke(null);
        }catch (Throwable ex){
            throw new AssertionError(ex);
        }
    }
}
