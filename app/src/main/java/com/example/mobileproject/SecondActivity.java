package com.example.mobileproject;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.mobileproject.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.mobileproject.SOMETHING");
            tv.setText(text);
        }
        Switch colorSwitch = findViewById(R.id.colorSwitch);
        TextView tv = (TextView) findViewById(R.id.textView);
        final ConstraintLayout mainLayout = findViewById(R.id.main);

        colorSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                mainLayout.setBackgroundColor(Color.BLACK);
                tv.setTextColor(Color.WHITE);
                colorSwitch.setTextColor(Color.WHITE);
            }   else    {
                mainLayout.setBackgroundColor(Color.WHITE);
                tv.setTextColor(Color.BLACK);
                colorSwitch.setTextColor(Color.BLACK);
            }
        });
    }
}