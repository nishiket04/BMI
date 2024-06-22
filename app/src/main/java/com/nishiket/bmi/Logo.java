package com.nishiket.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Logo extends AppCompatActivity {
    Animation pop;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        pop= AnimationUtils.loadAnimation(this,R.anim.pop);
        logo=findViewById(R.id.pic);

        Intent go = new Intent(Logo.this,MainActivity.class);
        logo.setAnimation(pop);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
           startActivity(go);
           finish();
            }
        },3000);
    }
}