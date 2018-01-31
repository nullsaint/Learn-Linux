package com.example.null_saint.learnlinux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


public class instruction extends AppCompatActivity implements View.OnClickListener {
    //making object
    private CardView what1, install2, vs3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        //defining card

        install2 = (CardView) findViewById(R.id.install);
        vs3 = (CardView) findViewById(R.id.vs);
        what1 = (CardView)findViewById(R.id.what_linux);

        //add OnClickListener
        install2.setOnClickListener(this);
        vs3.setOnClickListener(this);
        what1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.install: i = new Intent(this, install.class);
                startActivity(i);
                break;
            case R.id.vs: i = new Intent(this, vs.class);
                startActivity(i);
                break;
            case R.id.what_linux: i = new Intent(this,what_linux.class);
                startActivity(i);
                break;


        }
    }
}
