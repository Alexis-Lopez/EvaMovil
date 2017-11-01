package com.platzi.evatransportes.Adapters;

import android.app.Activity;
import android.app.Notification;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.platzi.evatransportes.Model.Notificaciones;
import com.platzi.evatransportes.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by trini on 26/10/17.
 */

public class AdapterNotifications extends RecyclerView.Adapter<AdapterNotifications.ViewHolder> {


    ArrayList<Notificaciones> notifications;
    private Activity activity;
    private int resources;

    public AdapterNotifications(ArrayList<Notificaciones> notifications, Activity activity, int resources) {
        this.notifications = notifications;
        this.activity = activity;
        this.resources = resources;
    }


    @Override
    public AdapterNotifications.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);
        return new AdapterNotifications.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterNotifications.ViewHolder holder, int position) {
        Notificaciones notificaciones = notifications.get(position);
        holder.TituloView.setText(notificaciones.getTitulo());
        holder.EstadoView.setText(notificaciones.getStatus());
        holder.DescriptionView.setText(notificaciones.getDescription());

    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ImgNotiView;
        private TextView  TituloView;
        private TextView  DescriptionView;
        private TextView  EstadoView;
        private ImageButton MenuView;

        public ViewHolder(View itemView) {
            super(itemView);
            ImgNotiView     =(ImageView) itemView.findViewById(R.id.iconNOT);
            TituloView      =(TextView)  itemView.findViewById(R.id.tvnotTitle);
            DescriptionView =(TextView)  itemView.findViewById(R.id.tvnotDescription);
            EstadoView      =(TextView)  itemView.findViewById(R.id.tvnotEstado);
            MenuView        =(ImageButton) itemView.findViewById(R.id.imgMenu);
        }
    }
}
