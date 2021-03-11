package com.example.spotify_ritu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class WaitingActivity extends AppCompatActivity {
    private Button mBtnNext;
    //private final int SPLASH_DISPLAY_LENGTH = 8000;
    //private ImageView mIvSpalashScreen;
   // private LottieAnimationView lottieAnimationView;
    private TextView mTvFindingMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        //initView();
        //mIvSpalashScreen=findViewById(R.id.splashscreen);
        //lottieAnimationView=findViewById(R.id.lottie);
        mTvFindingMusic=findViewById(R.id.TvFetch);

        //lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
    }

//    private void initView() {
//        mBtnNext=findViewById(R.id.Next);
//        mBtnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(WaitingActivity.this,HomePage.class);
//                startActivity(intent);
//            }
//        });
//    }

}

