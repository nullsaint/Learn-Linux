package com.example.null_saint.learnlinux;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Learn Linux");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(Color.parseColor("#880E4F"));


            Button button = findViewById(R.id.skip);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent cardview = new Intent(MainActivity.this, cardview.class);
                    startActivity(cardview);
                }
            });
        }

    }
}
