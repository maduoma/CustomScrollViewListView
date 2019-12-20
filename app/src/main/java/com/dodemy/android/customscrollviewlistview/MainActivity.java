package com.dodemy.android.customscrollviewlistview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //In your activity
        CustomScrollView myScrollView = findViewById(R.id.myScroll);
        myScrollView.setEnableScrolling(false); // disable scrolling
        myScrollView.setEnableScrolling(true); // enable scrolling
    }
}
