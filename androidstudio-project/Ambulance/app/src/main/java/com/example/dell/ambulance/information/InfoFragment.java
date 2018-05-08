package com.example.dell.ambulance.information;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.example.dell.ambulance.R;
import com.example.dell.ambulance.ambulance.AmbulanceAdapter;
import com.example.dell.ambulance.ambulance.AmbulanceList;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<InfoList> Info = new ArrayList<>();
        for(int i = 0;i<10 ;i++)
        {
            Info.add(new InfoList("Kejadian"+(i+1),"Lokasi",(i+1)+"-"+(i+1)+"-2018",R.drawable.ic_launcher_background));
        }
        InfoAdapter infoAdapter = new InfoAdapter(getContext(),Info);

        ListView listView =(ListView) view.findViewById(R.id.listInfo);
        listView.setAdapter(infoAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

}
