package com.example.null_saint.learnlinux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class understand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_understand);

        WebView wv;
        wv = (WebView)findViewById(R.id.understand);
        wv.loadUrl("file:///android_asset/understanding.html");
    }
}
