package com.example.null_saint.learnlinux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class shell extends AppCompatActivity implements View.OnClickListener {

    //making object
    private CardView what1, understanding1,basic1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shell);

        //defifing Cards
        what1 = (CardView) findViewById(R.id.what_shell);
        understanding1 = (CardView)findViewById(R.id.understanding);
        basic1 = (CardView)findViewById(R.id.basic);

        //setOnClick

        what1.setOnClickListener(this);
        understanding1.setOnClickListener(this);
        basic1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.what_shell : i = new Intent(this,what_shell.class);
                    startActivity(i);
            break;
            case R.id.understanding : i = new Intent(this,understand.class);
                    startActivity(i);
            break;
            case R.id.basic : i = new Intent(this,basic.class);
                    startActivity(i);
            break;
        }
    }
}
