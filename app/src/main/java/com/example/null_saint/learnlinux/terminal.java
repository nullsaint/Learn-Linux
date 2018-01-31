package com.example.null_saint.learnlinux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class terminal extends AppCompatActivity implements View.OnClickListener {

    private CardView shortcut1, basic_command;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminal);
        //
        shortcut1 = (CardView)findViewById(R.id.shortcut);
        basic_command = (CardView)findViewById(R.id.basic_command);

        //
        shortcut1.setOnClickListener(this);
        basic_command.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.shortcut : i = new Intent(this,shortcut.class);
            startActivity(i);
            break;
            case R.id.basic_command : i = new Intent(this,basic_command.class);
            startActivity(i);
            break;
        }
    }
}
