package com.example.myconnect4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Puissance4Board extends View {

    private final int boardColor;
    private final int RColor;
    private final int Ycolor;
    private final int LigneGagnante;

    private final Paint paint = new Paint();

    private int TailleCellules = getWidth()/7;

    public Puissance4Board(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.Puissance4Board, 0, 0);

        try {
            boardColor = a.getInteger(R.styleable.Puissance4Board_boardColor, 0);
            RColor = a.getInteger(R.styleable.Puissance4Board_RColor, 0);
            Ycolor = a.getInteger(R.styleable.Puissance4Board_YColor, 0);
            LigneGagnante = a.getInteger(R.styleable.Puissance4Board_LigneGagnante, 0);
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onMeasure(int width, int height) {
        super.onMeasure(width, height);

        int dimensions = Math.min(getMeasuredWidth(), getMeasuredHeight());
        TailleCellules = dimensions/7;
        setMeasuredDimension(dimensions, dimensions);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);

        drawPlateauJeu(canvas);
    }

    private void drawPlateauJeu(Canvas canvas){

        paint.setColor(boardColor);
        paint.setStrokeWidth(20);

        for (int i=1; i<8; i++){
            canvas.drawLine(TailleCellules*i, 0,TailleCellules*i, canvas.getWidth(), paint);
        }

        for (int j=1; j<6; j++){
            canvas.drawLine(0, TailleCellules*j,canvas.getWidth(),TailleCellules*j , paint);
        }

    }

}

