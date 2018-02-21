package com.gravitydestroyer.avishkar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Avishweb extends AppCompatActivity {
    private WebView webb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avishweb);

        WebView webb=(WebView)findViewById(R.id.avishweb);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.avskr.in/");
        webb.getSettings().setJavaScriptEnabled(true);
        webb.getSettings().setSupportZoom(true);
        webb.getSettings().setBuiltInZoomControls(true);

    }

}