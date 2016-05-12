package com.example.layer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;



/**
 * Created by Nearor on 5/12/16.
 */
public class MyView extends View{

    private static final int LAYER_FLAGS = Canvas.MATRIX_SAVE_FLAG | Canvas.CLIP_SAVE_FLAG
            | Canvas.HAS_ALPHA_LAYER_SAVE_FLAG | Canvas.FULL_COLOR_LAYER_SAVE_FLAG
            | Canvas.CLIP_TO_LAYER_SAVE_FLAG;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);
        Paint mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(150,150,100,mPaint);

        canvas.saveLayerAlpha(0,0,400,400,127,LAYER_FLAGS);
        mPaint.setColor(Color.RED);
        canvas.drawCircle(200,200,100,mPaint);
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
