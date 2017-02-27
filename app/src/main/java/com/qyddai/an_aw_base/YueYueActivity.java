package com.qyddai.an_aw_base;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.an.base.view.activity.SwipeFinishActivity;
import com.an.base.view.tips.pickerview.TimePickerView;
import com.an.base.view.widget.WRoundImageView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by qydda on 2017/2/21.
 */

public class YueYueActivity extends SwipeFinishActivity implements View.OnClickListener {
    private WRoundImageView imageView1;
    private WRoundImageView imageView2;
    private WRoundImageView imageView3;
    private WRoundImageView imageView4;
    private WRoundImageView imageViewTips;
    private float offsetValue;
    private static Boolean occurFlag = true;
    private TextView tvTips3;
    private TextView tvConfimChoose;
    private TextView tvConfim;
    private EditText editText;


    @Override
    public void initView() {
        setContentView(R.layout.sst_activity_yueyue);
        imageView1 = (WRoundImageView) findViewById(R.id.imageView1);
        imageView2 = (WRoundImageView) findViewById(R.id.imageView2);
        imageView3 = (WRoundImageView) findViewById(R.id.imageView3);
        imageView4 = (WRoundImageView) findViewById(R.id.imageView4);
        imageViewTips = (WRoundImageView) findViewById(R.id.imageViewTips);
        tvTips3 = (TextView) findViewById(R.id.tvTips3);
        tvConfimChoose = (TextView) findViewById(R.id.tvConfimChoose);
        editText = (EditText) findViewById(R.id.editText);
        tvConfim = (TextView) findViewById(R.id.tvConfim);
        tvConfimChoose.setOnClickListener(this);
        tvConfim.setOnClickListener(this);

        offsetValue = getResources().getDimension(R.dimen.DimenNativeNational);
        imageView1.setAlpha(1.0f);

        final TranslateAnimation animation0 = new TranslateAnimation(0, offsetValue, 0, 0);
        animation0.setDuration(700);
        animation0.setFillAfter(true);

        final TranslateAnimation animation1 = new TranslateAnimation(offsetValue, offsetValue, 0, offsetValue);
        animation1.setDuration(700);
        animation1.setFillAfter(true);

        final TranslateAnimation animation2 = new TranslateAnimation(offsetValue, 0, offsetValue, offsetValue);
        animation2.setDuration(700);
        animation2.setFillAfter(true);

        final TranslateAnimation animation3 = new TranslateAnimation(0, 0, offsetValue, 0);
        animation3.setDuration(700);
        animation3.setFillAfter(true);

        animation0.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (occurFlag == true) {
                    imageView2.setAlpha(1.0f);
                } else {
                    imageView2.setAlpha(0.0f);
                }
                imageViewTips.startAnimation(animation1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animation1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (occurFlag == true) {
                    imageView3.setAlpha(1.0f);
                } else {
                    imageView3.setAlpha(0.0f);
                }
                imageViewTips.startAnimation(animation2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animation2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (occurFlag == true) {
                    imageView4.setAlpha(1.0f);
                } else {
                    imageView4.setAlpha(0.0f);
                }
                imageViewTips.startAnimation(animation3);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animation3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (occurFlag == true) {
                    occurFlag = false;
                } else {
                    occurFlag = true;
                }
                if (occurFlag == false) {
                    imageView1.setAlpha(0.0f);
                } else {
                    imageView1.setAlpha(1.0f);
                }
                imageViewTips.startAnimation(animation0);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageViewTips.startAnimation(animation0);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvConfim:

                if (editText.getText().toString().trim().equals("1217") || (editText.getText().toString().trim().contains("12-17")) && editText.getText().toString().trim().contains("19")) {
                    showToast("成功");
                } else {
                    showToast("输入错误");
                }
                break;
            case R.id.tvConfimChoose:
                showToast("choose");
                //     TimePickerView 同样有上面设置样式的方法
                TimePickerView mTimePickerView = new TimePickerView(this, TimePickerView.Type.YEAR_MONTH_DAY);

                // 设置是否循环
                mTimePickerView.setCyclic(true);
                // 设置滚轮文字大小
//        mTimePickerView.setTextSize(TimePickerView.TextSize.SMALL);
                // 设置时间可选范围(结合 setTime 方法使用,必须在)
//        Calendar calendar = Calendar.getInstance();
//        mTimePickerView.setRange(calendar.get(Calendar.YEAR) - 100, calendar.get(Calendar.YEAR));
                // 设置选中时间
//        mTimePickerView.setTime(new Date());
                mTimePickerView.setOnTimeSelectListener(new TimePickerView.OnTimeSelectListener() {
                    @Override
                    public void onTimeSelect(Date date) {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
                        Toast.makeText(mContext, format.format(date), Toast.LENGTH_SHORT).show();
                        editText.setText(format.format(date));
                    }
                });
                mTimePickerView.show();
                break;
        }

    }
}
