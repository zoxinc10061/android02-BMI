package com.example.a02;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText height,weight;
    private Button bmi;
    private TextView num;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText)findViewById(R.id.textView2);
        weight = (EditText)findViewById(R.id.textView3);
        bmi = (Button)findViewById(R.id.button);
        num = (TextView)findViewById(R.id.textView4);
    }

    public void bmi(View view) {
        float total = (Float.parseFloat(weight.getEditableText().toString()))/(Float.parseFloat(height.getEditableText().toString())*Float.parseFloat(height.getEditableText().toString()));
        num.setText("BMI值為："+Float.toString(total));
    }
}