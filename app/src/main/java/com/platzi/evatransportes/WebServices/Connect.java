package com.platzi.evatransportes.WebServices;

import android.app.DownloadManager;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Interceptor;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.platzi.evatransportes.Model.TravelsDriver;
import com.platzi.evatransportes.Model.Usuario;
import com.platzi.evatransportes.ModelWS.CurrentUser;
import com.platzi.evatransportes.ModelWS.HttpRequestLogin;

/**
 * Created by trini on 31/10/17.
 */

public class Connect {

    private static final String URL_BASE = "http://192.168.0.36:3000/";
    private static ConnectWS connectWS;

    public static ConnectWS getConnectWS() {
        init();
        return connectWS;
    }
    public Connect(){

    }

    public static void init(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request request;

                if (CurrentUser.getToken()!= null) {
                    request = original.newBuilder()
                          /*.header("User-Agent", "Your-App-Name")*/
                            .header("Content-Type","application/json")
                            .header("X-User-Email",CurrentUser.getEmail())
                            .header("X-User-Token",  CurrentUser.getToken())
                            .method(original.method(), original.body())
                            .build();
                } else {
                    request = original.newBuilder()
                          /*.header("User-Agent", "Your-App-Name")*/
                            .header("Content-Type", "application/json")
                            .method(original.method(), original.body())
                            .build();
                }
                return chain.proceed(request);
            }
        });

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        OkHttpClient client = httpClient.build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        connectWS = retrofit.create(ConnectWS.class);

    }


    public interface ConnectWS{

        @POST("users/sign_in.json")
        Call<Usuario> login(@Body HttpRequestLogin requestLogIn);
        @GET("travelsDriver/{id}.json")
        Call<ArrayList<TravelsDriver>> getTravelsDrivers(@Path("id") int id);



    }

}
