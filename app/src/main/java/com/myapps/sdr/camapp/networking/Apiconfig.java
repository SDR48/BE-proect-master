package com.myapps.sdr.camapp.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiconfig {
    public static String BASE_URL = "http://192.168.43.97:5000";

    public static Retrofit getRetrofit() {

        return new Retrofit.Builder()
                .baseUrl(Apiconfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
