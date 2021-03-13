package com.example.demospotify1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaySong extends AppCompatActivity implements View.OnClickListener{
    //private ImageView mIvImageView;
    private Button mBtnStartService;
    private Button mBtnStopService;
    private Button mBtnPlayMusic;
    private Button mBtnPauseMusic;
    private MusicService musicService;
    private boolean isServiceStarted = false;
    //this service connection is needed in the parameter of bindService()
    //this method is just called after on create and on bind called which are there in MusicService.
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder musicServiceBinder) {
            MusicService.MusicServiceBinder binder = (MusicService.MusicServiceBinder) musicServiceBinder;
            musicService = binder.getService();
            isServiceStarted = true;

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isServiceStarted = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        initViews();

        //mIvImageView = findViewById(R.id.TvMusic);
        //mIvImageView.setImageResource(getIntent().getIntExtra("songs", ));
        // mIvImageView=findViewById(R.id.tvMusic);
        //mTvPlaceName=findViewById(R.id.tvMusic);
        //mTvPlaceName.setText(getIntent().getStringExtra("PlaceName"));

    }

    private void initViews() {
        mBtnStartService = findViewById(R.id.BtnStartService);
        mBtnPlayMusic = findViewById(R.id.BtnPlayMusic);
        mBtnPauseMusic = findViewById(R.id.BtnPauseMusic);
        mBtnStopService = findViewById(R.id.BtnStopService);
        mBtnStopService.setOnClickListener(this);
        mBtnPauseMusic.setOnClickListener(this);
        mBtnPlayMusic.setOnClickListener(this);
        mBtnStartService.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BtnPlayMusic:
                Intent intent = new Intent(PlaySong.this, MusicService.class);
                //instead of writing startService we are writing bindService
                bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
                break;
            case R.id.BtnPauseMusic:
                if (isServiceStarted) {
                    musicService.pauseMusic();
                }
                break;
            case R.id.BtnStartService:
                if (isServiceStarted) {
                    musicService.playMusic();
                }
                break;
            case R.id.BtnStopService:
                unbindService(serviceConnection);
                break;
        }
    }
}