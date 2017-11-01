package com.platzi.evatransportes.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.platzi.evatransportes.Model.Notificaciones;
import com.platzi.evatransportes.R;
import com.platzi.evatransportes.View.DetailsConductorActivity;

import java.util.ArrayList;

/**
 * Created by trini on 25/10/17.
 */

public class AdapterViajesCliente extends RecyclerView.Adapter<AdapterViajesCliente.VielHolder>{


    ArrayList<Notificaciones> notificaciones;
    private int resources;
    private Activity activity;

    public AdapterViajesCliente(ArrayList<Notificaciones> notificaciones, int resources, Activity activity) {
        this.notificaciones = notificaciones;
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

        Notificaciones notificacio = notificaciones.get(position);
        holder.TituloView.setText(notificacio.getTitulo());
        holder.EstadoView.setText(notificacio.getStatus());
        holder.DescriptionView.setText(notificacio.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(activity, DetailsConductorActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return notificaciones.size();
    }

    public class VielHolder extends RecyclerView.ViewHolder{

        private ImageView ImgNotiView;
        private TextView TituloView;
        private TextView  DescriptionView;
        private TextView  EstadoView;
        private ImageButton MenuView;
        public VielHolder(View itemView) {
            super(itemView);
            ImgNotiView     =(ImageView) itemView.findViewById(R.id.iconStatus);
            TituloView      =(TextView)  itemView.findViewById(R.id.tvcliDescription);
            DescriptionView =(TextView)  itemView.findViewById(R.id.tvcliTitle);
            EstadoView      =(TextView)  itemView.findViewById(R.id.tvcliEstado);
            MenuView        =(ImageButton) itemView.findViewById(R.id.imgMenuclien);

        }
    }
}
