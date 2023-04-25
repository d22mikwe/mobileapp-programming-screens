package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString("name");
        String age = extras.getString("age");
        String school = extras.getString("school");

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(school);
        TextView textView2 = (TextView) findViewById(R.id.textView3);
        textView2.setText(name);
        TextView textView3 = (TextView) findViewById(R.id.textView4);
        textView3.setText(age);

    }
}