package com.example.null_saint.learnlinux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ubuntu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubuntu);
        WebView wv;
        wv = (WebView)findViewById(R.id.web_ubuntu);
        wv.loadUrl("file:///android_asset/ubuntu.html");
    }
}
