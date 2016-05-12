package com.example.instrument;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView myView = new MyView(this);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.watch);

        frameLayout.addView(myView);
    }
}
