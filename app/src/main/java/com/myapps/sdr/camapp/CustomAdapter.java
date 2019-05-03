package com.myapps.sdr.camapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList <LeafHistory> leaf;

    public CustomAdapter(Context c, ArrayList<LeafHistory> leaf) {
        this.c = c;
        this.leaf = leaf;
    }

    @Override
    public int getCount() {
        return leaf.size();
    }

    @Override
    public Object getItem(int i) {
        return leaf.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(c).inflate(R.layout.listview_layout,viewGroup,false);
        }
        final LeafHistory l = (LeafHistory) this.getItem(i);

        TextView imageName = view.findViewById(R.id.imageName);
        TextView imageDate = view.findViewById(R.id.imageDate);
        ImageView leafImage = view.findViewById(R.id.leafImage);

        imageName.setText(l.getName());
        //imageDate.setText(l.getDate());

        Picasso.get().load(l.getUri()).placeholder(R.drawable.placeholder).into(leafImage);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, l.getName(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
