package com.gravitydestroyer.aavishkar.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Button;

import com.gravitydestroyer.aavishkar.R;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OnlineActivity extends AppCompatActivity {

    public void todesc1(View view){
        Intent intent = new Intent(getApplicationContext(),odesc1.class);
        startActivity(intent);
    }
    public void todesc2(View view){
        Intent intent = new Intent(getApplicationContext(),odesc2.class);
        startActivity(intent);
    }
    public void todesc3(View view){
        Intent intent = new Intent(getApplicationContext(),odesc3.class);
        startActivity(intent);
    }
    public void todesc4(View view){
        Intent intent = new Intent(getApplicationContext(),odesc4.class);
        startActivity(intent);
    }
    public void todesc5(View view){
        Intent intent = new Intent(getApplicationContext(),odesc5.class);
        startActivity(intent);
    }

    public void todesc7(View view){
        Intent intent = new Intent(getApplicationContext(),odesc7.class);
        startActivity(intent);
    }
    public void todesc8(View view){
        Intent intent = new Intent(getApplicationContext(),odesc8.class);
        startActivity(intent);
    }
    public void todesc6(View view){
        Intent intent = new Intent(getApplicationContext(),odesc6.class);
        startActivity(intent);
    }
    public void todesc9(View view){
        Intent intent = new Intent(getApplicationContext(),odesc9.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        setTitle("Online Events");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}