package com.example.dell.ambulance.ambulance;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dell.ambulance.R;

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
        for(int i = 0;i<10 ;i++)
        {
            Ambulance.add(new AmbulanceList("Nama Ambulance"+(i+1),"Rp 1000","Alamat"+(i+1),R.drawable.ic_launcher_background));
        }
        AmbulanceAdapter ambulanceAdapter = new AmbulanceAdapter(getContext(),Ambulance);

        ListView listView =(ListView) view.findViewById(R.id.listAmbulance);
        listView.setAdapter(ambulanceAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ambulance, container, false);
    }
}
