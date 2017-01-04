package com.example.piyush.gestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView message;
    private GestureDetectorCompat detector;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (TextView)findViewById(R.id.t1);
        this.detector = new GestureDetectorCompat(this,this);
        detector.setOnDoubleTapListener(this);



    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        message.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        message.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        message.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        message.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        message.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        message.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        message.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        message.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        message.setText("onFling");
        return true;
    }
    /////////////////end guestures //////////////
    @Override
    public boolean onTouchEvent(MotionEvent e){
        this.detector.onTouchEvent(e);

        return super.onTouchEvent(e);

    }





}
