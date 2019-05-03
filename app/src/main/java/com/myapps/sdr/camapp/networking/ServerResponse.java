package com.myapps.sdr.camapp.networking;

import com.google.gson.annotations.SerializedName;
public class ServerResponse {
    @SerializedName("Success")
    boolean success;
    @SerializedName("Message")
    String message;
    public String getmessage(){return message;}
    public boolean getsuccess(){return success;}
}
