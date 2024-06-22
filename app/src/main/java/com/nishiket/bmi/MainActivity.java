package com.nishiket.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText w,h;
    Button cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w=findViewById(R.id.weightEditText);
        h=findViewById(R.id.heightEditText);
        cl=findViewById(R.id.calculateButton);

         Intent toRe=new Intent(MainActivity.this,ResultActivity.class);

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float hi = Integer.parseInt(h.getText().toString());
                int we=Integer.parseInt(w.getText().toString());

                if(hi==0 || we==0){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    startActivity(toRe);
                }
                else {
                    float hiInM;
                    hiInM = (hi / 100);
                    float hit = hiInM * hiInM;
                    double res = (we / hit);
                    toRe.putExtra("resu", res);
                    startActivity(toRe);
                }
            }
        });

    }
}