package com.myapps.sdr.camapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.RangeValueIterator;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class InfoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("Chilli App is a initiative to provide easy to use and Faster description of diseases their crops can have")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("Connect With Us")
                .addEmail("jaykapade@gmail.com")
                .addInstagram("https://www.instagram.com/i__m_jk_lol/?hl=en")
                .addItem(createCopyRight())
                .create();

        setContentView(aboutPage);

    }

    private Element createCopyRight() {

        Element copyright = new Element();
        String copyRightString = String.format("Copyright %d by CodeBlooded", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyRightString);
        copyright.setIconDrawable(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);

        return copyright;

    }

}
