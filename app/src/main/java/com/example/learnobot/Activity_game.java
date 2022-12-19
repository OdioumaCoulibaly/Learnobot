package com.example.learnobot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_game extends AppCompatActivity {

    private Button mBoutton1;
    private Button mBoutton2;
    private Button mBoutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mBoutton1 = findViewById(R.id.button5);
        mBoutton2 = findViewById(R.id.button6);
        mBoutton3 = findViewById(R.id.button7);

        mBoutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page2Intent = new Intent(Activity_game.this, MainActivity2.class);
                startActivity(page2Intent);
            }
        });
    }

}