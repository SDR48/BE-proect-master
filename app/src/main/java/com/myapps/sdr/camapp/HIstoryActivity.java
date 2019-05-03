package com.myapps.sdr.camapp;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.commons.io.FileUtils;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Multipart;
import static android.R.attr.description;
import java.io.File;
import java.util.ArrayList;

public class HIstoryActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.FROYO)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        final ListView listView = findViewById(R.id.historyView);

        listView.setAdapter(new CustomAdapter(HIstoryActivity.this,getData()));
    }

    @RequiresApi(api = Build.VERSION_CODES.FROYO)
    private ArrayList<LeafHistory> getData(){
        ArrayList<LeafHistory> leafList = new ArrayList<>();

        File leafFolder = Environment.getExternalStoragePublicDirectory("Android/data/com.myapps.sdr.camapp/files/Pictures");

        LeafHistory l;

        if(leafFolder.exists()){
            File[] files = leafFolder.listFiles();

            for(int i=0; i< files.length;i++){
                File file = files[i];

                l= new LeafHistory();
                l.setName(file.getName());
                l.setUri(Uri.fromFile(file));
               // l.getDate((file.lastModified());

                leafList.add(l);

            }
        }

        return leafList;

    }

}
