package com.unity3d.player.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by one on 3/12/15.
 */
public class MyLiteTextView extends TextView {

    public MyLiteTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyLiteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyLiteTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/axima_light.ttf");
            setTypeface(tf);
        }
    }

}