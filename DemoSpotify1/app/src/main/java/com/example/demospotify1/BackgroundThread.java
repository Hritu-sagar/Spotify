package com.example.demospotify1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class BackgroundThread extends HandlerThread {
    private Handler handler;
    public BackgroundThread(String name) {
        super(name);
    }

    @Override
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        handler=new Handler(Looper.myLooper());
    }
    public void addTaskToQueue(Runnable task){
        if(handler!=null){
            handler.post(task);
        }
    }
}
