package com.unity3d.player.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by one on 3/12/15.
 */
public class MyLiteTextViewTitle extends TextView {

    public MyLiteTextViewTitle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyLiteTextViewTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyLiteTextViewTitle(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-ExtraBold.ttf");
            setTypeface(tf);
        }
    }

}