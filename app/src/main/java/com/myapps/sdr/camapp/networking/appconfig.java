package com.myapps.sdr.camapp.networking;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

public interface appconfig {
    @Multipart
    @POST("put")
    Call<ServerResponse> upload(
            @Field("image_name") String title, @Field("image") String image
            );
}
