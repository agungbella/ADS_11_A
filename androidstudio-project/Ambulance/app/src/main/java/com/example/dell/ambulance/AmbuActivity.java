package com.example.dell.ambulance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AmbuActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambu);
    }
    public void cardkejadian(View v){
        Intent i = new Intent(this.InfoKejadian.class);
        startActivity(i);
    }

}
