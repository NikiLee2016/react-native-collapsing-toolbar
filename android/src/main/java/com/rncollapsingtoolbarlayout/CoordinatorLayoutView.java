package com.rncollapsingtoolbarlayout;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.view.ViewGroup;

public class CoordinatorLayoutView extends CoordinatorLayout {

    public CoordinatorLayoutView(Context context) {
        super(context);

        int width  = ViewGroup.LayoutParams.MATCH_PARENT;
        int height = ViewGroup.LayoutParams.MATCH_PARENT;

        CoordinatorLayout.LayoutParams params = new CoordinatorLayout.LayoutParams(width, height);
        params.setBehavior(new AppBarLayout.ScrollingViewBehavior());
        this.setLayoutParams(params);
        this.setFitsSystemWindows(false);
    }
}