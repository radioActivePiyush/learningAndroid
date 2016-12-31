package com.example.piyush.mapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;// important

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LAYOOUT
        RelativeLayout ml = new RelativeLayout(this);
        ml.setBackground(Color.BLACK);

        //BUTTON
        Button rb = new Button(this);
        rb.setBackground(Color.DKGRAY);

        //BUTTON DETAILS
        RelativeLayout.LayoutParams b_details = new RelativeLayout.LayoutParams(
                WRAP_CONTENT,WRAP_CONTENT);

        b_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        b_details.addRule(RelativeLayout.CENTER_VERTICAL);

        ml.addView(rb);//ADD LAYOUT
        setContentView(ml);//SET CONTENT TO THIS VIEW



    }

}
