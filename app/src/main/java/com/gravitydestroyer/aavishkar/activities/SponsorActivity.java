package com.gravitydestroyer.aavishkar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gravitydestroyer.aavishkar.R;

public class SponsorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsor);
        setTitle("Our Partners");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
