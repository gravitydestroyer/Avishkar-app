package com.gravitydestroyer.aavishkar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gravitydestroyer.aavishkar.R;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class desc4 extends AppCompatActivity {

    public void phoneopen(View view){
        String phone = "8158892279";
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
        setContentView(R.layout.activity_desc4);
    }
}