package com.example.gamelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GameDetail extends AppCompatActivity {
    private TextView junkText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_full_screen);


        junkText = findViewById(R.id.textforjunk);

        String value = getIntent().getStringExtra("Guess");

        if(getIntent().getStringExtra("Guess") != null){
            junkText.setText(value);

        }


    }
}
