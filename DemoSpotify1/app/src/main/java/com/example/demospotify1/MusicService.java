package com.example.demospotify1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

public class MusicService extends Service {
    private MusicServiceBinder musicServiceBinder=new MusicServiceBinder();
    private MediaPlayer mediaPlayer;

    private BackgroundThread backgroundThread;
    //background is created because we want to play and pause music in foreground

    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        return musicServiceBinder;
    }
    public void playMusic(){
        //this background is going to play in background thread
        backgroundThread.addTaskToQueue(playRunnable);
    }
    public void pauseMusic(){
        backgroundThread.addTaskToQueue(pauseRunnable);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer=MediaPlayer.create(this,R.raw.thousand_year);
        backgroundThread=new BackgroundThread("ritu");
        backgroundThread.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private Runnable playRunnable=new Runnable() {
        @Override
        public void run() {
            mediaPlayer.start();
        }
    };
    private Runnable pauseRunnable=new Runnable() {
        @Override
        public void run() {
            mediaPlayer.pause();
        }
    };
    //we had created this class because we can not directly make an object of service class as it is
    // part of android and android does not allow to to make an object so we had created the another
    // class and we are passing parent class of Ibinder i.e binder.And then creating object of it in line 10

    public class MusicServiceBinder extends Binder {
        //we are writing public method(MusicService getService)  which will return us MusicService
        // class.once we get this class in mainActivity by making object of this class we can easily
        // access its method and in that method there is MusicService that are playMusic(),pauseMusic();
        public MusicService getService(){
            return  MusicService.this;
        }
    }
}
