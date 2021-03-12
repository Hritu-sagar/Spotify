package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTPActivity extends AppCompatActivity {
    private Button mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        initViews();
    }

    private void initViews() {
        mBtnNext=findViewById(R.id.btnNextDob);
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OTPActivity.this,BottonNavigationViewActivity.class);
                startActivity(intent);
            }
        });
    }
}