package com.example.dell.ambulance.account;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dell.ambulance.HomeActivity;
import com.example.dell.ambulance.R;

public class SignInActivity extends AppCompatActivity {

    private Button btSignIn;
    private TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btSignIn = (Button) findViewById(R.id.sign_in_bt);
        btSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doLogin("-", "-");
            }
        });

        tvSignUp = (TextView) findViewById(R.id.sign_in_tv_signup);
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
            }
        });
    }

    private void doLogin(String username, String pass) {
        startActivity(new Intent(SignInActivity.this, HomeActivity.class));
        finish();
    }
}
