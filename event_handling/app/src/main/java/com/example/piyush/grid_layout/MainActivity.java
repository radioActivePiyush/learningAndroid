package com.example.piyush.grid_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.big_button);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView changetext = (TextView)findViewById(R.id.my_text);
                        changetext.setText("BIG BUTTON");

                    }
                }

        );

        button.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView changetext = (TextView)findViewById(R.id.my_text);
                        changetext.setText("Text View");
                        return true;


                    }
                }

        );



    }
}
