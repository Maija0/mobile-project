package com.example.mobileproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.textView);
        Switch colorSwitch = findViewById(R.id.colorSwitch);
        Button animationBtn = (Button)findViewById(R.id.animationBtn);
        Button animationBtn2 = (Button)findViewById(R.id.animationBtn2);

        if (getIntent().hasExtra("com.example.mobileproject.SOMETHING")) {
            String text = getIntent().getExtras().getString("com.example.mobileproject.SOMETHING");
            tv.setText(text);
            Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_animation);
            tv.startAnimation(scaleAnimation);
        }
        ConstraintLayout mainLayout = findViewById(R.id.main);

        colorSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                mainLayout.setBackgroundColor(Color.BLACK);
                tv.setTextColor(Color.WHITE);
                colorSwitch.setTextColor(Color.WHITE);
                animationBtn.setTextColor(Color.WHITE);
                animationBtn2.setTextColor(Color.WHITE);

            }   else    {
                mainLayout.setBackgroundColor(Color.WHITE);
                tv.setTextColor(Color.BLACK);
                colorSwitch.setTextColor(Color.BLACK);
                animationBtn.setTextColor(Color.BLACK);
                animationBtn2.setTextColor(Color.BLACK);
            }
        });

        animationBtn.setOnClickListener(v -> {
            Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
            tv.startAnimation(rotateAnimation);
        });

        animationBtn2.setOnClickListener(v -> {
            Animation disappearAnimation = AnimationUtils.loadAnimation(this, R.anim.disappear_animation);
            tv.startAnimation(disappearAnimation);
        });
    }
}