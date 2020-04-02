package com.example.animationtime;

import android.animation.TimeInterpolator;

public class MyTimeInterpolator implements TimeInterpolator {
    @Override
    public float getInterpolation(float input){
        float fraction;
        fraction=input*input;
        return fraction;
    }
}
