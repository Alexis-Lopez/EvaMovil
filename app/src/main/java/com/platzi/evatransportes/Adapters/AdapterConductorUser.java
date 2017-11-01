package com.platzi.evatransportes.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.platzi.evatransportes.Model.Viaje;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.View.DetailsConductorActivity;
import com.platzi.evatransportes.View.DetailsGenericActivity;

import java.util.ArrayList;

/**
 * Created by trini on 27/10/17.
 */

public class AdapterConductorUser extends RecyclerView.Adapter<AdapterConductorUser.VielHolder> {
    private ArrayList<Viaje> viajes;
    private int resources;

    public AdapterConductorUser(ArrayList<Viaje> viajes, int resources, Activity activity) {
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
        Viaje viaje =  viajes.get(position);
        holder.DestinoView.setText(viaje.getDestino());
        holder.EstadoView.setText(viaje.getEstado());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, DetailsConductorActivity.class);
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

        public VielHolder(View itemView) {
            super(itemView);

            DestinoView = (TextView) itemView.findViewById(R.id.destCond);
            EstadoView = (TextView) itemView.findViewById(R.id.estadoCond);

        }
    }
}
