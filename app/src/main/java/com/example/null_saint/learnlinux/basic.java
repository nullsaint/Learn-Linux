package com.example.null_saint.learnlinux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        WebView wv;
        wv = (WebView)findViewById(R.id.web_basic_shell);
        wv.loadUrl("file:///android_asset/basic_shell.html");
    }
}
