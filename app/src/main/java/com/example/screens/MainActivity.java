package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String name = "Mikael";
                String age = "23";
                String school = "HiS";

                Bundle extras = new Bundle();
                extras.putString("name", "Mikael");
                extras.putString("age", "23");
                extras.putString("school", "His");

                intent.putExtras(extras);

                startActivity(intent);
            }
        });
    }
}
