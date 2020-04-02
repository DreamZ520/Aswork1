package com.example.animationtime;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        super.onStart();
        mTextView=findViewById(R.id.textView);

        /*ObjectAnimator anim1=ObjectAnimator.ofFloat(mTextView,"TranslationY",300.0f,0.0f);
        anim1.setDuration(3000);
        anim1.setRepeatCount(3);
        anim1.setRepeatMode(ObjectAnimator.RESTART);
       anim1.setInterpolator(new BounceInterpolator());
        anim1.start();*/

    }
}
