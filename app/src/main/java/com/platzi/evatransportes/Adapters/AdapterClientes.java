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

import com.platzi.evatransportes.ConductorActivity;
import com.platzi.evatransportes.Model.Cliente;
import com.platzi.evatransportes.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by trini on 26/10/17.
 */

public class AdapterClientes extends RecyclerView.Adapter<AdapterClientes.VielHolder> {
    private ArrayList<Cliente> clientes;
    private int resources;
    private Activity activity;

    public AdapterClientes(ArrayList<Cliente> clientes, int resources, Activity activity) {
        this.clientes = clientes;
        this.resources = resources;
        this.activity = activity;
    }

    @Override
    public AdapterClientes.VielHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);
        return new AdapterClientes.VielHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterClientes.VielHolder holder, int position) {
        Cliente cliente =  clientes.get(position);
        holder.NombreView.setText(cliente.getNombre());
        holder.DireccionView.setText(cliente.getDirrecion());
        holder.NumeroView.setText(cliente.getNumeroViajes());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, ConductorActivity.class);
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return clientes.size();
    }

    public class VielHolder extends RecyclerView.ViewHolder {
        private TextView  NombreView;
        private TextView  DireccionView;
        private TextView  NumeroView;
        private ImageButton MenuView;

        public VielHolder(View itemView) {
            super(itemView);
            NombreView      =   (TextView) itemView.findViewById(R.id.tvnnameCliente);
            DireccionView   =   (TextView) itemView.findViewById(R.id.tvdirCliente);
            NumeroView      =   (TextView) itemView.findViewById(R.id.tvNumeroViajes);
        }
    }
}
