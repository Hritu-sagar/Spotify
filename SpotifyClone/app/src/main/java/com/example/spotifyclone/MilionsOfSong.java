package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MilionsOfSong extends AppCompatActivity {
    private Button mBtnSignup;
    private Button mBtnLogin;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_millionsof_song);
        initViews();
    }

    private void initViews() {
        mBtnSignup = findViewById(R.id.btnSignUpFree);
        mBtnLogin = findViewById(R.id.btnLogin);
        mBtnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MilionsOfSong.this, SignUpActivity.class);
                startActivity(intent);

            }
        });
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MilionsOfSong.this, SignUpActivity.class);
               startActivity(intent);

                }





        });

    }
}
