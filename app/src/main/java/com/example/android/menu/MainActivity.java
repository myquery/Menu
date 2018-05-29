package com.example.android.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
    * Method to log the content of the textViews to the console
    */
    public void printToLogs(View view) {
        TextView mangoText = (TextView) findViewById(R.id.mango);
        TextView blueberryText = (TextView) findViewById(R.id.blueberry);
        TextView chocolateText = (TextView) findViewById(R.id.chocolate);

        Log.v("MainActivity", "Mango text view" + mangoText);
        Log.v("MainActivity", "Blueberry text view" + blueberryText);
        Log.v("MainActivity", "Chocolate text view" + chocolateText);
    }
}
