package com.gravitydestroyer.aavishkar.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.gravitydestroyer.aavishkar.R;

import java.net.URISyntaxException;
import java.util.Objects;

public class WebsiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        setTitle("Eurekoin");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webb= findViewById(R.id.avishweb);
        webb.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Uri uri = request.getUrl();
                if (Objects.equals(uri.getScheme(), "whatsapp")) {
                    try {
                        Intent intent = Intent.parseUri(request.getUrl().toString(), Intent.URI_INTENT_SCHEME);
                        if (intent.resolveActivity(getPackageManager()) != null)
                            startActivity(intent);
                        return true;
                    } catch (URISyntaxException use) {
                        use.printStackTrace();
                    }
                }
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        webb.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Android 5.1.1; Nexus 5 Build/LMY48B) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/43.0.2357.65 Mobile Safari/537.36");
        webb.loadUrl("http://eurekoin.avskr.in/dashboard");
        webb.getSettings().setJavaScriptEnabled(true);
        webb.getSettings().setSupportZoom(true);
    }
}
