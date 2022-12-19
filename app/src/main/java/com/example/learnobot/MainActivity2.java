package com.example.learnobot;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button B1;
    private Button B2;
    private Button B3;
    private TextView mTexView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        B1 = findViewById(R.id.button1);
        mTexView = findViewById(R.id.textView1);
        B2 = findViewById(R.id.button2);
        B3 = findViewById(R.id.button3);
    }
}