package com.example.null_saint.learnlinux;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class cardview extends Activity implements View.OnClickListener {
    //making object
    private CardView instructionc1,shellc2,terminalc3,variousc4,aboutc5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        if(Build.VERSION.SDK_INT>=21){
            getWindow().setStatusBarColor(Color.parseColor("#64DD17"));
        }


        //defining cards
        instructionc1 = (CardView) findViewById(R.id.instruction);
        shellc2 = (CardView) findViewById(R.id.shell);
        terminalc3 = (CardView) findViewById(R.id.terminal);
        variousc4 = (CardView) findViewById(R.id.various);
        aboutc5 = (CardView) findViewById(R.id.about);

        //add clicklistener to the cards
        instructionc1.setOnClickListener(this);
        shellc2.setOnClickListener(this);
        terminalc3.setOnClickListener(this);
        variousc4.setOnClickListener(this);
        aboutc5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.instruction : i = new Intent(this,instruction.class);
                startActivity(i);
                break;
            case R.id.shell : i = new Intent(this,shell.class);
                startActivity(i);
                break;
            case R.id.terminal : i = new Intent(this,terminal.class);
                startActivity(i);
                break;
            case R.id.various : i = new Intent(this,various.class);
                startActivity(i);
                break;
            case R.id.about : i = new Intent(this,about.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}