package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayMusicActivity extends AppCompatActivity {
    private Button btnPlay;
    private Button btnPause;
    private MusicService musicService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        initViews();
    }

    private void initViews() {
        btnPlay=findViewById(R.id.btnPlaysong);
        btnPause=findViewById(R.id.btnPause);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicService.startMusic();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicService.pauseMusic();
            }
        });
    }


}