package com.example.dell.ambulance.account;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dell.ambulance.R;

public class SignUpActivity extends AppCompatActivity {

    private Button btSignUp;
    private TextView tvSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btSignUp = (Button) findViewById(R.id.sign_up_bt);
        btSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSignUp("-","-","-","-","-");
            }
        });

        tvSignUp = (TextView) findViewById(R.id.sign_up_tv_signin);
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSignUp("-","-","-","-","-");
            }
        });
    }

    private void doSignUp(String fullName, String email,String password,String NIK,String address){
        finish();
    }
}
