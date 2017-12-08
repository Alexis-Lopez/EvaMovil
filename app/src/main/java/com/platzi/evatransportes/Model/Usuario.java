package com.platzi.evatransportes.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by trini on 31/10/17.
 */

public class Usuario implements Parcelable {



    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("authentication_token")
    @Expose
    private String authentication;


    @SerializedName("rol")
    @Expose
    private String rol;

    protected Usuario(Parcel in) {
        email = in.readString();
        authentication = in.readString();
        rol = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {

        @Override
        public Usuario createFromParcel(Parcel in) {
           // Usuario usuario = new Usuario();

            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(rol);
        parcel.writeValue(authentication);
        parcel.writeValue(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
