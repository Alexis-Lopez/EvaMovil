package com.platzi.evatransportes.UserDrivers.View;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.platzi.evatransportes.Model.TravelsDriver;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.ViajesActivity;
import com.platzi.evatransportes.View.DetailsConductorActivity;

import java.util.ArrayList;

/**
 * Created by trini on 27/10/17.
 */

public class AdapterConductorUser extends RecyclerView.Adapter<AdapterConductorUser.VielHolder> {
    private ArrayList<TravelsDriver> viajes;
    private int resources;

    public AdapterConductorUser(ArrayList<TravelsDriver> viajes, int resources, Activity activity) {
        this.viajes = viajes;
        this.resources = resources;
        this.activity = activity;
    }

    private Activity activity;

    @Override
    public VielHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);
        return new VielHolder(view);
    }

    @Override
    public void onBindViewHolder(VielHolder holder, int position) {
        TravelsDriver viaje =  viajes.get(position);
        holder.DestinoView.setText(viaje.getDetails());
        holder.EstadoView.setText(viaje.gethPlanned());
        holder.kms.setText(viaje.getKms());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, ViajesActivity.class);
                activity.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return viajes.size();
    }

    public class VielHolder extends RecyclerView.ViewHolder {
        private TextView DestinoView;
        private TextView EstadoView;
        private TextView kms;

        public VielHolder(View itemView) {
            super(itemView);

            DestinoView = (TextView) itemView.findViewById(R.id.destCond);
            EstadoView  = (TextView) itemView.findViewById(R.id.hplanen);
            kms         = (TextView) itemView.findViewById(R.id.kmsCond);

        }
    }
}
