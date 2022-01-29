package com.example.project1_ntran35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button gameStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameStart = (Button) findViewById(R.id.btn_start);
        gameStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTheGame();
            }
        });
    }

    public void startTheGame() {
        Intent intent = new Intent (MainActivity.this, activityPlayGame.class);
        startActivity(intent);
    }

}