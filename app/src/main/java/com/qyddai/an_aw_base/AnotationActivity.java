package com.qyddai.an_aw_base;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.an.base.view.activity.SwipeCloseActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

/**
 * Created by qydda on 2016/12/6.
 */

@ContentView(R.layout.sst_activity_littletrck)
public class AnotationActivity extends SwipeCloseActivity {
    //以下为headview_standard.xml
    @ViewInject(R.id.anLlBack)
    private LinearLayout anLlBack;
    @ViewInject(R.id.anTvBack)
    private TextView anTvBack;
    @ViewInject(R.id.anPb)
    private ProgressBar anPb;
    @ViewInject(R.id.anTvTitle)
    private TextView anTvTitle;

    @ViewInject(R.id.anLlRight)
    private LinearLayout anLlRight;
    @ViewInject(R.id.anTvRight)
    private TextView anTvRight;
    @ViewInject(R.id.anIvRight)
    private ImageView anIvRight;

    //分割线0000---complex
    @ViewInject(R.id.anLlRRight)
    private LinearLayout anLlRRight;
    @ViewInject(R.id.anTvRRight)
    private TextView anTvRRight;
    @ViewInject(R.id.anIvRRight)
    private ImageView anIvRRight;


    //分割线0000--不采用注解。

//    private LinearLayout anLlBack;
//    private TextView anTvBack;
//    private ProgressBar anPb;
//    private TextView anTvTitle;
//
//    private LinearLayout anLlRight;
//    private TextView anTvRight;
//    private ImageView anIvRight;
//
//    private LinearLayout anLlRRight;
//    private TextView anTvRRight;
//    private ImageView anIvRRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sst_activity_littletrck);

        anLlBack = (LinearLayout) findViewById(R.id.anLlBack);
        anTvBack = (TextView) findViewById(R.id.anTvBack);
        anPb = (ProgressBar) findViewById(R.id.anPb);
        anTvTitle = (TextView) findViewById(R.id.anTvTitle);

        anLlRight = (LinearLayout) findViewById(R.id.anLlRight);
        anTvRight = (TextView) findViewById(R.id.anTvRight);
        anIvRight = (ImageView) findViewById(R.id.anIvRight);

        anLlRRight = (LinearLayout) findViewById(R.id.anLlRRight);
        anTvRRight = (TextView) findViewById(R.id.anTvRRight);
        anIvRRight = (ImageView) findViewById(R.id.anIvRRight);

        anTvTitle.setText(R.string.AnotationActivity);
    }

    @Override
    public void initView() {

    }

}
