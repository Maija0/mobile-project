package com.example.mobileproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button multiplyBtn = (Button) findViewById(R.id.multiplyBtn);

        EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 - num2;
                resultTextView.setText(result + "");
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });
    }
}