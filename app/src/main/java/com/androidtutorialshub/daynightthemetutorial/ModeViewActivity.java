package com.androidtutorialshub.daynightthemetutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.widget.TextView;

public class ModeViewActivity extends AppCompatActivity {

    private TextView textModeType;
    private int modeType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_view);

        initViews();

    }

    private void initViews() {
        textModeType = (TextView) findViewById(R.id.textModeType);

        modeType = AppCompatDelegate.getDefaultNightMode();

        if (modeType == AppCompatDelegate.MODE_NIGHT_AUTO) {
            textModeType.setText("Default Mode Type: Auto");
        } else if (modeType == AppCompatDelegate.MODE_NIGHT_NO) {
            textModeType.setText("Default Mode Type: Day");
        } else if (modeType == AppCompatDelegate.MODE_NIGHT_YES) {
            textModeType.setText("Default Mode Type: Night");
        }
    }
}
