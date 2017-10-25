package com.platzi.evatransportes.Fracments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.platzi.evatransportes.Adapters.ViajeConductorRecyclerView;
import com.platzi.evatransportes.Model.Viaje;
import com.platzi.evatransportes.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaViajesFragment extends Fragment {


    public ListaViajesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista_viajes, container, false);
        RecyclerView viajesCondRecycler = (RecyclerView) view.findViewById(R.id.rvViajes_Cond);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        viajesCondRecycler.setLayoutManager(linearLayoutManager);

        ViajeConductorRecyclerView viajeConductorRecyclerView = new ViajeConductorRecyclerView(buidViajes(),R.layout.item_viaje,getActivity());

        viajesCondRecycler.setAdapter(viajeConductorRecyclerView );

        return view;

    }

    public ArrayList<Viaje> buidViajes(){
        ArrayList<Viaje> viajes = new ArrayList<>();
        viajes.add(new Viaje("Chiapas","Precaucion"));
        viajes.add(new Viaje("Saltillo","Pesado"));
        viajes.add(new Viaje("San Luis Potosi","Delicado"));
        viajes.add(new Viaje("Camargo","Precaucion"));

        return viajes;
    }

}
