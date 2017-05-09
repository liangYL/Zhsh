package com.boke.zhbj.base.pager;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.boke.zhbj.base.BasePager;

/**
 * Created by administrator on 2017/3/31.
 */
public class SettingPager extends BasePager {

    public SettingPager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {

        tvTitle.setText("设置");
        btnMenu.setVisibility(View.GONE);

        TextView view = new TextView(mActivity);
        view.setText("设置");
        view.setTextColor(Color.RED);
        view.setTextSize(22);
        view.setGravity(Gravity.CENTER);

        flContent.addView(view);
    }
}
