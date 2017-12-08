package com.platzi.evatransportes.UserDrivers.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.platzi.evatransportes.Model.TravelsDriver;
import com.platzi.evatransportes.R;


import java.util.ArrayList;


public class ConductorUserFragment extends Fragment {
    private final String TAG = "CONDUCTOR_FRAG";
    private RecyclerView viajesCondRecycler;
    private AdapterConductorUser viajeConductorRecyclerView;
    private LinearLayout llNoReminders;


    public ConductorUserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conductor_user, container, false);
        init(view);
        return view;
    }

    private void init(View view){
        viajesCondRecycler = (RecyclerView) view.findViewById(R.id.rvConductorUser);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        viajesCondRecycler.setLayoutManager(linearLayoutManager);

        viajeConductorRecyclerView = new AdapterConductorUser(buidViajes(),R.layout.item_viaje,getActivity());

        viajesCondRecycler.setAdapter(viajeConductorRecyclerView );

    }


    public ArrayList<TravelsDriver> buidViajes(){
        ArrayList<TravelsDriver> viajes = new ArrayList<>();
        viajes.add(new TravelsDriver("Nuevo Laredo - Monterrey","Kilomentros 227","Horas Planeadas: 2:36"));
        return viajes;
    }
}
