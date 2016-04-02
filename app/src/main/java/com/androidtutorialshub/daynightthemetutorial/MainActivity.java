package com.androidtutorialshub.daynightthemetutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Button Variable
    private Button buttonAutoMode;
    private Button buttonDayMode;
    private Button buttonNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        initViews();
        initListeners();
    }

    /**
     * method to initialize the views
     */
    private void initViews() {
        buttonAutoMode = (Button) findViewById(R.id.buttonAutoMode);
        buttonDayMode = (Button) findViewById(R.id.buttonDayMode);
        buttonNightMode = (Button) findViewById(R.id.buttonNightMode);

    }

    /**
     * method to initialize the listeners
     */
    private void initListeners() {
        buttonAutoMode.setOnClickListener(this);
        buttonDayMode.setOnClickListener(this);
        buttonNightMode.setOnClickListener(this);
    }

    /**
     * onClick Listener to capture button click
     *
     * @param v
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonAutoMode:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
                break;
            case R.id.buttonDayMode:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case R.id.buttonNightMode:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
        }

        Intent intent = new Intent(MainActivity.this, ModeViewActivity.class);
        startActivity(intent);


    }
}
