package com.cypressf.myapplication;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Copied from an answer to http://stackoverflow.com/questions/7814017/is-it-possible-to-disable-scrolling-on-a-viewpager
 */

public class ScrollBlockingViewPager extends ViewPager {
    private boolean isPagingEnabled = true;

    public ScrollBlockingViewPager(Context context) {
        super(context);
    }

    public ScrollBlockingViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return this.isPagingEnabled && super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return this.isPagingEnabled && super.onInterceptTouchEvent(event);
    }

    public void setPagingEnabled(boolean b) {
        this.isPagingEnabled = b;
    }
}
