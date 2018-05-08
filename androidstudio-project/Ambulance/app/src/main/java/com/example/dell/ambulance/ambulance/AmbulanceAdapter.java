package com.example.dell.ambulance.ambulance;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.ambulance.R;

import java.util.ArrayList;

public class AmbulanceAdapter extends ArrayAdapter<AmbulanceList>{
    private static final String LOG_TAG = AmbulanceAdapter.class.getSimpleName();

    public AmbulanceAdapter(Context context, ArrayList<AmbulanceList> Ambulance){
        super(context,0,Ambulance);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_ambulance,parent,false);
        }
        AmbulanceList index = getItem(position);

        TextView nameAmbulance = (TextView) listItemView.findViewById(R.id.TextNameAmbulance);
        nameAmbulance.setText(index.getmNama());

        TextView nameTarif = (TextView) listItemView.findViewById(R.id.TextTarif);
        nameTarif.setText(index.getmTarif());


        TextView nameAlamat = (TextView) listItemView.findViewById(R.id.TextAlamat);
        nameAlamat.setText(index.getmAlamat());

        ImageView imageProfile = (ImageView) listItemView.findViewById(R.id.IconList);
        imageProfile.setImageResource(index.getmProfile());

        return listItemView;
    }
}
