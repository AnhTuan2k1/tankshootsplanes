package com.example.caloriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class A_mucdich extends AppCompatActivity {
    private Button tangcan, giamcan, giucan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_mucdich);
        giucan = (Button)findViewById(R.id.giucan);
        tangcan = (Button)findViewById(R.id.tangcan);
        giamcan = (Button)findViewById(R.id.giamcan);

        tangcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation=AnimationUtils.loadAnimation(A_mucdich.this,R.anim.fadein);
                tangcan.startAnimation(animation);openA_info_1();
            }
        });

        giamcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation=AnimationUtils.loadAnimation(A_mucdich.this,R.anim.fadein);
                giamcan.startAnimation(animation);openA_info_1();
            }
        });

        giucan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Animation animation=AnimationUtils.loadAnimation(A_mucdich.this,R.anim.fadein);
            giucan.startAnimation(animation);openA_info_1();
        }
    });
    }
    public void openA_info_1(){
        Intent intent = new Intent(this,A_info_1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}