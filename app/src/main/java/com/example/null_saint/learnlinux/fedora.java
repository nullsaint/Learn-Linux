package com.example.null_saint.learnlinux;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class fedora extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fedora);

        WebView wv;
        wv = (WebView) findViewById(R.id.web_fedora);
        wv.loadUrl("file:///android_asset/fedora.html");
    }
}
