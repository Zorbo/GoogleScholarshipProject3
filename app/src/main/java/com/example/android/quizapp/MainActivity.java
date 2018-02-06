package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private CharSequence getCustomerName(){

        TextView playerName = findViewById(R.id.input_name);
        return playerName.toString();

    }

    public void displayResult(View view){

        if (score > 0) {
            Toast.makeText(getApplicationContext(),"HOHOHOHHOOHOHHOH",Toast.LENGTH_LONG).show();
            return;
        } else {
            score++;
        }

    }


    public void clickNext(View view) {
        setContentView(R.layout.page_one);

    }

    public void clickNextPageOne(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page1_radio_button1);
        if (buttonPageOne.isChecked()) {
            score++;
        }

        setContentView(R.layout.page_two);
    }

    public void clickNextPageTwo(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page2_radio_button3);
        if (buttonPageOne.isChecked()) {
            score++;
        }

        setContentView(R.layout.page_three);
    }

    public void clickNextPageThree(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page3_radio_button1);
        if (buttonPageOne.isChecked()) {
            score++;
        }

        setContentView(R.layout.page_four);
    }

    public void clickNextPageFour(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page4_radio_button2);
        if (buttonPageOne.isChecked()) {
            score++;
        }

        setContentView(R.layout.page_five);
    }

    public void clickNextPageFive(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page5_radio_button1);
        if (buttonPageOne.isChecked()) {
            score++;
        }

        setContentView(R.layout.page_six);
    }

    public void clickNextPageSix(View view) {

        RadioButton buttonPageOne = findViewById(R.id.page6_radio_button3);
        if (buttonPageOne.isChecked()) {
            score++;
        }

        setContentView(R.layout.page_end);
    }

    public void clickBackPageTwo(View view) {
        setContentView(R.layout.page_one);
    }

    public void clickBackPageThree(View view) {
        setContentView(R.layout.page_two);
    }

    public void clickBackPageFour(View view) {
        setContentView(R.layout.page_three);
    }

    public void clickBackPageFive(View view) {
        setContentView(R.layout.page_four);
    }

    public void clickBackPageSix(View view) {
        setContentView(R.layout.page_five);
    }


}
