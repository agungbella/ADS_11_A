package com.example.dell.ambulance.ambulance;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.ambulance.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmbulanceFragment extends Fragment {


    public AmbulanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ambulance, container, false);
    }

}
