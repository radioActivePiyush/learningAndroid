package com.example.piyush.mapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;// important

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LAYOOUT
        RelativeLayout ml = new RelativeLayout(this);
        ml.setBackgroundColor(Color.DKGRAY);

        //BUTTON
        Button rb = new Button(this);
        rb.setBackgroundColor(Color.RED);
        rb.setText(R.string.button_text);

        //USERNAME INPUT
        EditText u_name = new EditText(this);
        // IDS
        rb.setId(1);

        u_name.setId(2);



        //BUTTON POSITION
        RelativeLayout.LayoutParams b_details = new RelativeLayout.LayoutParams(
                WRAP_CONTENT,WRAP_CONTENT);

        b_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        b_details.addRule(RelativeLayout.CENTER_VERTICAL);


        //USERNAME POSITION
        RelativeLayout.LayoutParams u_details = new RelativeLayout.LayoutParams(
                WRAP_CONTENT,WRAP_CONTENT);

        u_details.addRule(RelativeLayout.ABOVE, rb.getId());
        u_details.addRule(RelativeLayout.CENTER_HORIZONTAL);

        u_details.setMargins(0,0,0,50);


        Resources r = getResources();
        int px =(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());

        u_name.setWidth(px);

        //ADD TO THIS LAYOUT (THIS NOW  BECOMES THE CHILD )
        ml.addView(rb,b_details);
        ml.addView(u_name,u_details);


        setContentView(ml);//SET CONTENT TO THIS VIEW



    }

}
