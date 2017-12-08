package com.platzi.evatransportes.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.platzi.evatransportes.Model.Travels;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.ViajesConductorActivity;

import java.util.ArrayList;

/**
 * Created by ISA on 10/11/2017.
 */

public class ViajeConductorRecyclerView extends RecyclerView.Adapter<ViajeConductorRecyclerView.ViajesCDViewHolder> {

    private ArrayList<Travels> viajes;
    private int resources;
    private Activity activity;

    public ViajeConductorRecyclerView(ArrayList<Travels> viajes, int resources, Activity activity) {
        this.viajes = viajes;
        this.resources = resources;
        this.activity = activity;
    }



    @Override
    public ViajesCDViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);
        return new ViajesCDViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViajesCDViewHolder holder, int position) {
        Travels viaje =  viajes.get(position);
        holder.DestinoView.setText(viaje.getDestino());
        holder.EstadoView.setText(viaje.getEstado());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, ViajesConductorActivity.class);
                activity.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return viajes.size();
    }

    public class ViajesCDViewHolder extends RecyclerView.ViewHolder {
        private TextView DestinoView;
        private TextView EstadoView;

        public ViajesCDViewHolder(View itemView) {
            super(itemView);

            DestinoView = (TextView) itemView.findViewById(R.id.destCond);
            EstadoView = (TextView) itemView.findViewById(R.id.hplanen);

        }
    }
}
