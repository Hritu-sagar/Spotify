package com.example.spotify_ritu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class WaitingActivity extends AppCompatActivity {
    private Button mBtnNext;
    private final int SPLASH_DISPLAY_LENGTH = 4000;
    //private ImageView mIvSpalashScreen;
   // private LottieAnimationView lottieAnimationView;
    private TextView mTvFindingMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        mTvFindingMusic=findViewById(R.id.TvFetch);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(WaitingActivity.this,home.class);
                WaitingActivity.this.startActivity(intent);
                WaitingActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }

}

