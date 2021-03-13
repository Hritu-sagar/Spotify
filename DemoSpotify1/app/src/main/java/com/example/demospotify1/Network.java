package com.example.demospotify1;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    public static HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    public static Retrofit getInstance(){
        Retrofit.Builder builder=new Retrofit.Builder()
                .baseUrl("https://api.giphy.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build());
        return builder.build();
    }
}
