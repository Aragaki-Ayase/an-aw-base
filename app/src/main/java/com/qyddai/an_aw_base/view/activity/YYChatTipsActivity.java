package com.qyddai.an_aw_base.view.activity;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.an.base.view.activity.SwipeFinishActivity;
import com.an.base.view.ytips.pickerview.CityPickerView;
import com.an.base.view.ytips.pickerview.OptionsPickerView;
import com.an.base.view.ytips.pickerview.TimePickerView;
import com.an.base.view.ytips.pickerview.listener.OnSimpleCitySelectListener;
import com.an.base.view.ytips.selector.DigitSelector;
import com.an.base.view.ytips.selector.SexSelector;
import com.an.base.view.ytips.selector.TimeSelector;
import com.an.base.view.widget.PickerView;
import com.qyddai.an_aw_base.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by qydda on 2017/2/21.
 */

public class YYChatTipsActivity extends SwipeFinishActivity {

    @Override
    public void initView() {
        setContentView(R.layout.sst_activity_chat);
    }
}
