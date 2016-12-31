package com.example.piyush.mapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout ml = new RelativeLayout(this);
        ml.setBackground(Color.BLACK);
        Re




        Button rb = new Button(this);
        rb.setBackground(Color.DKGRAY);

        ml.addView(rb);
        setContentView(ml);



    }

}
