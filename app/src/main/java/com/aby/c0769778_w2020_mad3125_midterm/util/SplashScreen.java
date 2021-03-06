package com.aby.c0769778_w2020_mad3125_midterm.util;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.aby.c0769778_w2020_mad3125_midterm.ui.PersonInformationEntryActivity;
import com.aby.c0769778_w2020_mad3125_midterm.R;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, PersonInformationEntryActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);  //Change after testing

    }
}
