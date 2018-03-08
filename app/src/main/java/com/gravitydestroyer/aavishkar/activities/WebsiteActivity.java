package com.gravitydestroyer.aavishkar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.gravitydestroyer.aavishkar.R;

public class WebsiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        setTitle("Eurekoin");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webb=(WebView)findViewById(R.id.avishweb);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://eurekoin.avskr.in/dashboard");
        webb.getSettings().setJavaScriptEnabled(true);
        webb.getSettings().setSupportZoom(true);
    }
}
