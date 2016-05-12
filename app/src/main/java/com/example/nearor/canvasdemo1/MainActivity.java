package com.example.nearor.canvasdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView myView = new MyView(this);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.root);

        frameLayout.addView(myView);
    }
}
