package com.platzi.evatransportes.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.platzi.evatransportes.Model.ItemDetails;
import com.platzi.evatransportes.R;

import java.util.ArrayList;

/**
 * Created by trini on 24/10/17.
 */

public class AdapterItemDetails extends RecyclerView.Adapter<AdapterItemDetails.ViewHolder> {

    private ArrayList<ItemDetails> itemDetailses;

    public AdapterItemDetails(ArrayList<ItemDetails> itemDetailses) {
        this.itemDetailses = itemDetailses;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTitulo;
        public TextView mContenido;
        public ViewHolder(View v) {
            super(v);
            mTitulo = (TextView) v.findViewById(R.id.tvTitle);
            mContenido =(TextView)v.findViewById(R.id.tvSubtitle);
        }
    }



    @Override
    public AdapterItemDetails.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_details,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdapterItemDetails.ViewHolder holder, int position) {
        holder.mTitulo.setText(itemDetailses.get(position).getTitulo());
        holder.mContenido.setText(itemDetailses.get(position).getContenido());
    }

    @Override
    public int getItemCount() {
        return itemDetailses.size();
    }
}
