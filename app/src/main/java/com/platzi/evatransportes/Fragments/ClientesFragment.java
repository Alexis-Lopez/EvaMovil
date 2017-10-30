package com.platzi.evatransportes.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.platzi.evatransportes.Adapters.AdapterClientes;
import com.platzi.evatransportes.Adapters.AdapterNotifications;
import com.platzi.evatransportes.Model.Cliente;
import com.platzi.evatransportes.Model.Notificaciones;
import com.platzi.evatransportes.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClientesFragment extends Fragment {


    public ClientesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_clientes, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvtransClientes);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterClientes adapterClientes = new AdapterClientes(buidClientes(),R.layout.item_cliente,getActivity());

        recyclerView.setAdapter(adapterClientes);
        return view;

    }

    public ArrayList<Cliente> buidClientes(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan","Privada 23","Numero de Viajes : 4"));
        clientes.add(new Cliente("Pedro","Privada 24","Numero de Viajes :5"));
        clientes.add(new Cliente("Santiago","Privada 25","Numero de Viajes :6"));
        clientes.add(new Cliente("Cristal","Privada 27","Numero de Viajes:2"));

        return clientes;
    }



}
