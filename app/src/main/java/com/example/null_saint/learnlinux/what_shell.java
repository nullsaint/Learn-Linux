package com.example.null_saint.learnlinux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class what_shell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_shell);

        WebView wv;
        wv = (WebView) findViewById(R.id.web_shell);
        wv.loadUrl("file:///android_asset/what_shell.html");

    }
}
