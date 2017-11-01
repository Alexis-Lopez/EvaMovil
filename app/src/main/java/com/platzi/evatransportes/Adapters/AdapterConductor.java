package com.platzi.evatransportes.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.platzi.evatransportes.Model.Conductor;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.View.DetailsGenericActivity;

import java.util.ArrayList;

/**
 * Created by trini on 26/10/17.
 */

public class AdapterConductor extends RecyclerView.Adapter<AdapterConductor.VielHolder> {
    private ArrayList<Conductor> conductors;
    private int resources;
    private Activity activity;

    public AdapterConductor(ArrayList<Conductor> conductors, int resources, Activity activity) {
        this.conductors = conductors;
        this.resources = resources;
        this.activity = activity;
    }

    @Override
    public VielHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);

        return new VielHolder(view);
    }

    @Override
    public void onBindViewHolder(VielHolder holder, int position) {
        Conductor conductor = conductors.get(position);
        holder.NombreView.setText(conductor.getNombre());
        holder.DestinoView.setText(conductor.getDestino());
        holder.HoraView.setText(conductor.getHoraLlegada());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, DetailsGenericActivity.class);
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return conductors.size();
    }

    public class VielHolder extends RecyclerView.ViewHolder{
        private TextView NombreView;
        private TextView  DestinoView;
        private TextView  HoraView;
        private ImageButton MenuView;

        public VielHolder(View itemView) {
            super(itemView);

            NombreView      =   (TextView) itemView.findViewById(R.id.tvnnameConductor);
            DestinoView   =   (TextView) itemView.findViewById(R.id.tvDestinoConductor);
            HoraView      =   (TextView) itemView.findViewById(R.id.tvHoraAproximada);
        }
    }
}
