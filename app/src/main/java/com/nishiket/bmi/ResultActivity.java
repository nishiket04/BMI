package com.nishiket.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    TextView re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        re=findViewById(R.id.setR);

        Intent fromRe=getIntent();
        double res=fromRe.getDoubleExtra("resu",0);
        Animation pop;
        pop = AnimationUtils.loadAnimation(this,R.anim.pop);
        if(res>25 && res <100){
            re.setText("Overweight");
            re.startAnimation(pop);
        } else if (res < 18 && res>1) {
            re.setText("Underweight");
            re.startAnimation(pop);
        }
        else if(res>=18 && res<=25){
            re.setText("Healthy");
            re.startAnimation(pop);
        }
        else{
            re.setText("Invalid Input! Try again");
            re.startAnimation(pop);
        }
    }
}