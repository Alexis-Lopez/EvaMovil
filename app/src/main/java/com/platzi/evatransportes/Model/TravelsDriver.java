package com.platzi.evatransportes.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by trini on 28/11/17.
 */

public class TravelsDriver implements Parcelable{

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("gps")
    @Expose
    private String gps;

    @SerializedName("details")
    @Expose
    private String details;

    @SerializedName("hoursPlanned")
    @Expose
    private String hPlanned;

    @SerializedName("kms")
    @Expose
    private String kms;

    @SerializedName("idOrigen")
    @Expose
    private String  Origen;

    @SerializedName("idDestine")
    @Expose
    private String Destino;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String gethPlanned() {
        return hPlanned;
    }

    public void sethPlanned(String hPlanned) {
        this.hPlanned = hPlanned;
    }

    public String getKms() {
        return kms;
    }

    public void setKms(String kms) {
        this.kms = kms;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }



    protected TravelsDriver(Parcel in) {
        details = in.readString();
        hPlanned = in.readString();
        kms = in.readString();
        Origen = in.readString();
        Destino = in.readString();
    }

    public TravelsDriver(String details,String horasplanned,String Kms){
        this.details = details;
        this.hPlanned = horasplanned;
        this.kms =Kms;
    }

    public TravelsDriver() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(id);
        parcel.writeString(gps);
        parcel.writeString(details);
        parcel.writeString(hPlanned);
        parcel.writeString(kms);
        parcel.writeString(Origen);
        parcel.writeString(Destino);
    }

    public final static Parcelable.Creator<TravelsDriver> CREATOR = new Creator<TravelsDriver>() {

        @Override
        public TravelsDriver createFromParcel(Parcel parcel) {
            TravelsDriver instance = new TravelsDriver();
            instance.id = ((Integer) parcel.readValue((Integer.class.getClassLoader())));
            instance.gps = ((String) parcel.readValue(String.class.getClassLoader()));
            instance.details = ((String) parcel.readValue(String.class.getClassLoader()));
            instance.hPlanned = ((String) parcel.readValue(String.class.getClassLoader()));
            instance.kms = ((String) parcel.readValue(String.class.getClassLoader()));
            instance.Origen = ((String) parcel.readValue(String.class.getClassLoader()));
            instance.Destino = ((String) parcel.readValue(String.class.getClassLoader()));
            return instance;
        }

        @Override
        public TravelsDriver[] newArray(int size) {
            return new TravelsDriver[size];
        }
    };
}
