package com.an.base.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.an.base.model.entity.ResponseDayNightModel;

/**
 * Created by sunshuntao 2016.09.19
 */
public class DayNightHelper {

    public final static String MODE = "day_night_mode";

    private SharedPreferences mSharedPreferences;

    public DayNightHelper(SharedPreferences sp) {
        this.mSharedPreferences = sp;
    }

    /**
     * 保存模式设置
     *
     * @param mode
     * @return
     */
    public boolean setMode(ResponseDayNightModel mode) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(MODE, mode.getName());
        return editor.commit();
    }

    /**
     * 夜间模式
     *
     * @return
     */
    public boolean isNight() {
        String mode = mSharedPreferences.getString(MODE, ResponseDayNightModel.DAY.getName());
        if (ResponseDayNightModel.NIGHT.getName().equals(mode)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 日间模式
     *
     * @return
     */
    public boolean isDay() {
        String mode = mSharedPreferences.getString(MODE, ResponseDayNightModel.DAY.getName());
        if (ResponseDayNightModel.DAY.getName().equals(mode)) {
            return true;
        } else {
            return false;
        }
    }
}
