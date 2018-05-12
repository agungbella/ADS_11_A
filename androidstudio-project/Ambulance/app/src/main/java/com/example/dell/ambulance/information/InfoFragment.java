package com.example.dell.ambulance.information;



import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        Info.add(new InfoList("Kejadian 1","Lokasi","1-1-2018",R.drawable.kecelakaan1));
        Info.add(new InfoList("Kejadian 2","Lokasi","2-2-2018",R.drawable.kecelakaan2));
        Info.add(new InfoList("Kejadian 3","Lokasi","3-3-2018",R.drawable.kecelakaan3));
        Info.add(new InfoList("Kejadian 4","Lokasi","4-4-2018",R.drawable.kecelakaan4));
        Info.add(new InfoList("Kejadian 5","Lokasi","5-5-2018",R.drawable.kecelakaan6));
        Info.add(new InfoList("Kejadian 6","Lokasi","7-7-2018",R.drawable.kecelakaan7));
        Info.add(new InfoList("Kejadian 7","Lokasi","1-1-2018",R.drawable.kecelakaan8));
        Info.add(new InfoList("Kejadian 8","Lokasi","6-6-2018",R.drawable.kecelakaan3));
        Info.add(new InfoList("Kejadian 9","Lokasi","4-4-2018",R.drawable.kecelakaan6));

        InfoAdapter infoAdapter = new InfoAdapter(getContext(),Info);

        ListView listView =(ListView) view.findViewById(R.id.listInfo);
        listView.setAdapter(infoAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getContext(), DetailInfoActivity.class));
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

}
