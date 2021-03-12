package com.example.spotifyclone;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

public class MusicService extends Service {
    private MediaPlayer mediaPlayer;
    private int songId;

    public MusicService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        if (intent != null) {
            songId = intent.getIntExtra("songId", songId);

        }
        mediaPlayer = MediaPlayer.create(this, songId);
        return new MusicServiceBinder();
    }

    public class MusicServiceBinder extends Binder {
        public MusicService getMusicServiceInstance() {
            return MusicService.this;
        }
    }

    public void startMusic() {
        mediaPlayer.start();
    }

    public void pauseMusic() {
        mediaPlayer.pause();
    }
}