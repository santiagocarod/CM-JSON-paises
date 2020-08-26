package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {
    TextView capital,name,intlName,initials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        capital = findViewById(R.id.capital);
        name = findViewById(R.id.name);
        intlName = findViewById(R.id.intlName);
        initials = findViewById(R.id.initials);

        Intent intent = getIntent();

        capital.setText(intent.getStringExtra("capital"));
        name.setText(intent.getStringExtra("name"));
        intlName.setText(intent.getStringExtra("intlName"));
        initials.setText(intent.getStringExtra("initials"));

    }
}