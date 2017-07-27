package com.example.dan.mathgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        int partA = 9;
        int partB = 9;
        int correctAnswer = partA + partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer + 1;

        TextView textObjectPartA = (TextView) findViewById(R.id.textPartA);
        TextView textObjectPartB = (TextView) findViewById(R.id.textPartB);

        Button buttonObjectChoice1 = (Button) findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 = (Button) findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 = (Button) findViewById(R.id.buttonChoice3);

    }
}
