package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button web,frame,list;
    Spinner spinner;
    EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  INFLATE   */
        frame = findViewById(R.id.frame);
        web = findViewById(R.id.web);
        list = findViewById(R.id.list);
        spinner = findViewById(R.id.spinnerEducativo);
        user = findViewById(R.id.usuario);

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),FrameActivity.class);
                Log.i("LAYOUTS","Item: "+spinner.getSelectedItem());
                intent.putExtra("item",spinner.getSelectedItem().toString());
                intent.putExtra("usuario",user.getText().toString());
                startActivity(intent);

            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),WebActivity.class));
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),ListActivity.class));
            }
        });
    }
}