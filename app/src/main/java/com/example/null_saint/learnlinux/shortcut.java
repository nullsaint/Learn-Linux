package com.example.null_saint.learnlinux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class shortcut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortcut);

        WebView wv;
        wv = (WebView)findViewById(R.id.terminal_shortcut);
        wv.loadUrl("file:///android_asset/terminal_shortcut.html");
    }
}
