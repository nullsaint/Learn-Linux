package com.example.null_saint.learnlinux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class various extends AppCompatActivity implements View.OnClickListener {

    //making object
    private CardView ubuntu1,fedora1,debian1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_various);

        ubuntu1 = (CardView)findViewById(R.id.ubuntu);
        fedora1 = (CardView)findViewById(R.id.fedora);
        debian1 = (CardView)findViewById(R.id.debian);

        //
        ubuntu1.setOnClickListener(this);
        fedora1.setOnClickListener(this);
        debian1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.ubuntu : i = new Intent(this,ubuntu.class);
            startActivity(i);
            break;
            case R.id.fedora : i = new Intent(this,fedora.class);
            startActivity(i);
            break;
            case R.id.debian : i = new Intent(this,debian.class);
            startActivity(i);
            break;
        }
    }
}
