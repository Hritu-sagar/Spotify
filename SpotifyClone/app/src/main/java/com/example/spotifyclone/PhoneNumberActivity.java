package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhoneNumberActivity extends AppCompatActivity {
    private Button mBtnNext;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        initViews();
    }

    private void initViews() {
        mBtnNext = findViewById(R.id.btnNextotp);
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneNumberActivity.this, OTPActivity.class);
                startActivity(intent);

            }
        });
    }
}