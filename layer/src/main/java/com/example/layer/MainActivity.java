package com.example.layer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private MyView myView;

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = new MyView(this);
        frameLayout = (FrameLayout) findViewById(R.id.root_fr);
        frameLayout.addView(myView);

    }
}
