package com.example.easytutomusicapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.easytutomusicapp.R;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        logo();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences=getSharedPreferences("login",MODE_PRIVATE);
                Boolean check=preferences.getBoolean("flag",false);

                Intent intent;
                if (check)
                {
                    intent=new Intent(splashscreen.this, MainActivity.class);

                }
                else
                {
                    intent=new Intent(splashscreen.this, signin.class);


                }
                startActivity(intent);
            }
        },4000);




    }

    public void logo() {
        YoYo.with(Techniques.Flash)
                .duration(2000)
                .repeat(5)
                .playOn(findViewById(R.id.tv2));


    }
}