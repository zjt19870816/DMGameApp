package com.stx.xhb.dmgameapp.mvp.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.stx.core.base.BaseMvpActivity;
import com.stx.core.mvp.IPresenter;
import com.stx.xhb.dmgameapp.R;

import butterknife.Bind;

/**
 * Author：xiaohaibin
 * Time：2017/9/21
 * Emil：xhb_199409@163.com
 * Github：https://github.com/xiaohaibin/
 * Describe：资讯详情
 */

public class NewsDetailsActivity extends BaseMvpActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.vp_container)
    ViewPager vpContainer;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_news_detail;
    }

    @Override
    protected void onInitialization(Bundle bundle) {

    }

    @Override
    protected IPresenter onLoadPresenter() {
        return null;
    }
}
