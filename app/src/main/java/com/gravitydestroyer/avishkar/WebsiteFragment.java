package com.gravitydestroyer.avishkar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class WebsiteFragment extends Fragment {


    public WebsiteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_website, container, false);
        WebView webb=(WebView)v.findViewById(R.id.avishweb);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.avskr.in/");
        webb.getSettings().setJavaScriptEnabled(true);
        webb.getSettings().setSupportZoom(true);
        webb.getSettings().setBuiltInZoomControls(true);
        return v;

    }

}
