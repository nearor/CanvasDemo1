package com.example.instrument;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Nearor on 5/9/16.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //画外圆

        Paint paintCircle = new Paint();
        paintCircle.setStyle(Paint.Style.STROKE);
        paintCircle.setAntiAlias(true);
        paintCircle.setStrokeWidth(5);
        canvas.drawCircle(400,400,400,paintCircle);

        //画刻度
        Paint paintLine = new Paint();
        for (int i = 0; i < 24; i++) {
            if(i==0||i==6||i==12||i==18){
                paintLine.setStrokeWidth(5);
                paintLine.setTextSize(30);
                canvas.drawLine(400,0,400,0,paintLine);

            }
        }

    }
}
