package com.example.dell.ambulance.information;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.ambulance.R;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<InfoList>{
    private static final String LOG_TAG = InfoAdapter.class.getSimpleName();

    public InfoAdapter(Context context, ArrayList<InfoList> Info){
        super(context,0,Info);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_info,parent,false);
        }
        InfoList index = getItem(position);

        TextView nameAmbulance = (TextView) listItemView.findViewById(R.id.TextNameKejadian);
        nameAmbulance.setText(index.getmNamakejadian());

        TextView nameTarif = (TextView) listItemView.findViewById(R.id.TextLokasiKejadian);
        nameTarif.setText(index.getmLokasikejadian());


        TextView nameAlamat = (TextView) listItemView.findViewById(R.id.TextTanggalKejadian);
        nameAlamat.setText(index.getmTanggalkejadian());

        ImageView imageProfile = (ImageView) listItemView.findViewById(R.id.ImageKejadian);
        imageProfile.setImageResource(index.getmProfile());

        return listItemView;
    }
}
