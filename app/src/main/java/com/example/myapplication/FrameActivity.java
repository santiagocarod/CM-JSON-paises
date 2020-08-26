package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FrameActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        textView = findViewById(R.id.tvEducacion);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("usuario")+" tiene "+intent.getStringExtra("item"));

    }
}