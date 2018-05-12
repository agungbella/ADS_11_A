package com.example.dell.ambulance.ambulance;



import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dell.ambulance.R;
import com.example.dell.ambulance.information.DetailInfoActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmbulanceFragment extends Fragment {


    public AmbulanceFragment() {
        // Required empty public constructor
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<AmbulanceList> Ambulance = new ArrayList<>();
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 1000","Alamat",R.drawable.nama1));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 2000","Alamat",R.drawable.nama2));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 3000","Alamat",R.drawable.nama3));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 4000","Alamat",R.drawable.nama4));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 5000","Alamat",R.drawable.nama2));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 6000","Alamat",R.drawable.nama6));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 7000","Alamat",R.drawable.nama7));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 8000","Alamat",R.drawable.nama8));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 9000","Alamat",R.drawable.nama2));
        Ambulance.add(new AmbulanceList("Nama Ambulance","Rp 4000","Alamat",R.drawable.nama10));

        AmbulanceAdapter ambulanceAdapter = new AmbulanceAdapter(getContext(),Ambulance);

        ListView listView =(ListView) view.findViewById(R.id.listAmbulance);
        listView.setAdapter(ambulanceAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getContext(), DetailAmbulanceActivity.class));
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ambulance, container, false);
    }
}
