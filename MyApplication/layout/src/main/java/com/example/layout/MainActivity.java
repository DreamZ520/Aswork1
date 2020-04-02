package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(View v){
        //Intent intent = new Intent(this,DisplayActivity.class);
        //startActivity(intent);
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        startActivity(intent);

    }
}
