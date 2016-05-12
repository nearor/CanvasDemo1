package com.example.nearor.canvasdemo1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Nearor on 5/6/16.
 */
public class MyView extends View {

    Context m_context;

    public MyView(Context context) {
        super(context);

        m_context = context;
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //重写OnDraw（）函数，在每次重绘时自主实现绘图
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);//抗锯齿的功能
        paint.setColor(Color.RED);//填充颜色
        paint.setStyle(Paint.Style.FILL);//填充的样式

        paint.setStrokeWidth(15);//设置画笔的粗细

        //设置画布的背景
        // canvas.drawRGB(255,255,255);

        //画圆
        //canvas.drawCircle(190,200,150,paint);
        //canvas.drawCircle(500,500,150,paint);

        //直线
        canvas.drawLine(200,600,600,900,paint);

        //多条直线
        float[] pts = {10,10,700,700,600,600,400,400};
        canvas.drawLines(pts,paint);

        //点
        canvas.drawPoint(800,800,paint);

        //多个点
        float[] points = {1100,1100,1200,1200,1300,1300,1400,1400};
        canvas.drawPoints(points,2,6,paint);

        //画矩形
        canvas.drawRect(10,10,100,100,paint);

        //使用RectF构造矩形
        RectF rect = new RectF(120,10,210,100);
        canvas.drawRect(rect,paint);

        //使用Rect构造矩形
        Rect rect2 = new Rect(230,10,320,100);
        canvas.drawRect(rect2,paint);

        //圆角矩形
        RectF rect3 = new RectF(340,10,420,100);
        canvas.drawRoundRect(rect3,20,10,paint);

        //画一个椭圆
        RectF rect4 = new RectF(20,200,220,290);
        canvas.drawOval(rect4,paint);

        //画一个弧
        RectF rect5 = new RectF(20,600,220,690);
        canvas.drawArc(rect5,0,60,true,paint);


    }
}
