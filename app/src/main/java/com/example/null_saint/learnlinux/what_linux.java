package com.example.null_saint.learnlinux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class what_linux extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_linux);

        WebView wv;
        wv = (WebView) findViewById(R.id.web_what_linux);
        wv.loadUrl("file:///android_asset/what.html");

    }
}
