package com.gravitydestroyer.aavishkar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gravitydestroyer.aavishkar.R;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class desc11 extends AppCompatActivity {

    public void phoneopen(View view){
        String phone = "9083504399";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }

    public void fbopen(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.facebook.com/aavishkar.nitd/"));
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc11);
    }
}