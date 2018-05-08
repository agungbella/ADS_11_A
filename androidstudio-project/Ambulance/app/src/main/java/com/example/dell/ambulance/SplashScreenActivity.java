package com.example.dell.ambulance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.ambulance.account.SignInActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(SplashScreenActivity.this, SignInActivity.class);
        startActivity(intent);

        finish();
    }
}
