package com.platzi.evatransportes.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.platzi.evatransportes.Adapters.AdapterClientes;
import com.platzi.evatransportes.Adapters.AdapterConductor;
import com.platzi.evatransportes.Model.Cliente;
import com.platzi.evatransportes.Model.Conductor;
import com.platzi.evatransportes.R;

import java.util.ArrayList;


public class ConductoresFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_conductores, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvtransConduct);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterConductor adapterConductor = new AdapterConductor(buidClientes(),R.layout.item_conductores,getActivity());

        recyclerView.setAdapter(adapterConductor);
        return view;

    }

    public ArrayList<Conductor> buidClientes(){
        java.util.ArrayList<Conductor> clientes = new ArrayList<>();
        clientes.add(new Conductor("Juan Ahumada","Viaje:Nuevo Laredo - Monterrey","Numero de Viajes : 1"));

        return clientes;
    }

}
