package com.platzi.evatransportes.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.platzi.evatransportes.Adapters.AdapterViajesCliente;
import com.platzi.evatransportes.Model.Notificaciones;
import com.platzi.evatransportes.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViajesClienteFragment extends Fragment {


    public ViajesClienteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_viajes_cliente, container, false);

        RecyclerView viajesCliente = (RecyclerView) view.findViewById(R.id.rvtransViajesCliente);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        viajesCliente.setLayoutManager(linearLayoutManager);

         AdapterViajesCliente adapterViajesCliente = new AdapterViajesCliente(buidViajesCliente(),R.layout.itemcliente_user,getActivity());

        viajesCliente.setAdapter(adapterViajesCliente );

        return view;

    }

    public ArrayList<Notificaciones> buidViajesCliente(){
        ArrayList<Notificaciones> viajes = new ArrayList<>();
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));
        return viajes;
    }




}
