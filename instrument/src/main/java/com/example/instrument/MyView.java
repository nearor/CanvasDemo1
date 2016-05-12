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

    private int mWight ;

    private int mHeight;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //获取宽高参数
        mWight = getMeasuredWidth();

        mHeight = getMeasuredHeight();

        //画外圆
        Paint paintCircle = new Paint();
        paintCircle.setStyle(Paint.Style.STROKE);
        paintCircle.setAntiAlias(true);
        paintCircle.setStrokeWidth(5);
        canvas.drawCircle(mWight / 2,mHeight / 2,mWight / 2,paintCircle);

        //画刻度
        Paint paintLine = new Paint();
        paintCircle.setStrokeWidth(3);
        for (int i = 0; i < 24; i++) {
            if(i==0||i==6||i==12||i==18){
                paintLine.setStrokeWidth(5);
                paintLine.setTextSize(30);
                canvas.drawLine(mWight / 2,mHeight / 2 - mWight / 2,
                        mWight / 2,mHeight / 2 - mWight / 2 + 60,
                        paintLine);
                String degree = String.valueOf(i);
                canvas.drawText(degree,
                        mWight / 2 - paintLine.measureText(degree) / 2,
                        mHeight / 2 - mWight / 2 + 90,
                        paintLine);
            }else {
                paintLine.setStrokeWidth(3);
                paintLine.setTextSize(15);
                canvas.drawLine(mWight / 2, mHeight / 2 - mWight / 2,
                        mWight / 2,mHeight / 2 - mWight / 2 + 30,
                        paintLine);
                String degree = String.valueOf(i);
                canvas.drawText(degree,mWight / 2 - paintLine.measureText(degree) / 2,
                        mHeight / 2 - mWight / 2 + 60,
                        paintLine);
            }

            canvas.rotate(15,mWight / 2,mHeight / 2);
        }

       // 画圆心
        Paint paintPoint = new Paint();
        paintPoint.setStrokeWidth(30);
        canvas.drawPoint(mWight / 2,mHeight / 2,paintPoint);

        //画指针
        Paint paintHour = new Paint();
        paintHour.setStrokeWidth(20);
        Paint paintMinute = new Paint();
        paintMinute.setStrokeWidth(10);
        canvas.save();
        canvas.translate(mWight / 2,mHeight / 2);
        canvas.drawLine(0,0,100,100,paintHour);
        canvas.drawLine(0,0,100,200,paintMinute);
        canvas.restore();
    }

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
