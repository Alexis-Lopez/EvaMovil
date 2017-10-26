package com.platzi.evatransportes.Fracments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.platzi.evatransportes.Adapters.AdapterNotifications;
import com.platzi.evatransportes.Model.Notificaciones;
import com.platzi.evatransportes.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {


    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvNotification);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterNotifications adapterNotifications = new AdapterNotifications(buidNotification(),getActivity(),R.layout.item_notification);

        recyclerView.setAdapter(adapterNotifications);

        return view;
    }

    public ArrayList<Notificaciones> buidNotification(){
        ArrayList<Notificaciones> viajes = new ArrayList<>();
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));
        viajes.add(new Notificaciones("Chiapas","Precaucion","A ver que sale xD"));

        return viajes;
    }

}
