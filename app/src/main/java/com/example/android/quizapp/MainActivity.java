package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private String playerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayResult(View view){


        if (score == 0) {
            Toast.makeText(getApplicationContext(), "Dear " + playerName + " you scored: " + score +
                    " out of 6\n NEVER GIVE UP!", Toast.LENGTH_LONG).show();
            return;
        }

        if (score > 0 && score <= 3) {
            Toast.makeText(getApplicationContext(), "Dear " + playerName + " you scored: " + score +
                    " out of 6\n KEEP PRACTICING!", Toast.LENGTH_LONG).show();
            return;
        }

        if (score > 3) {
            Toast.makeText(getApplicationContext(), "Dear " + playerName + " you scored: " + score +
                    " out of 6\n CONGRATULATIONS!", Toast.LENGTH_LONG).show();
        }
    }


    public void clickNext(View view) {

        EditText name = findViewById(R.id.name_field);
        playerName = name.getText().toString();

        setContentView(R.layout.page_one);

    }

    public void clickNextPageOne(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page1_radio_button2);
        if (buttonPageOne.isChecked()) {
            score = score + 1;
        }

        setContentView(R.layout.page_two);
    }

    public void clickNextPageTwo(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page2_radio_button3);
        if (buttonPageOne.isChecked()) {
            score = score + 1;
        }

        setContentView(R.layout.page_three);
    }

    public void clickNextPageThree(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page3_radio_button1);
        if (buttonPageOne.isChecked()) {
            score = score + 1;
        }

        setContentView(R.layout.page_four);
    }

    public void clickNextPageFour(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page4_radio_button3);
        if (buttonPageOne.isChecked()) {
            score = score + 1;
        }

        setContentView(R.layout.page_five);
    }

    public void clickNextPageFive(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page5_radio_button1);
        if (buttonPageOne.isChecked()) {
            score = score + 1;
        }

        setContentView(R.layout.page_six);
    }

    public void clickNextPageSix(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page6_radio_button3);
        if (buttonPageOne.isChecked()) {
            score = score + 1;
        }

        setContentView(R.layout.page_end);
    }

}
