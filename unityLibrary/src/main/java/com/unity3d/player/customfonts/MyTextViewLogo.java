package com.unity3d.player.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by one on 3/12/15.
 */
public class MyTextViewLogo extends TextView {

    public MyTextViewLogo(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewLogo(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewLogo(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/axima_bold.ttf");
            setTypeface(tf);
        }
    }

}