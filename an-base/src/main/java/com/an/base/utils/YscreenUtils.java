package com.an.base.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by qydq on 2015/11/27.
 */
public class YscreenUtils {

    public static int height;
    public static int width;
    private Context context;

    private static YscreenUtils instance;

    private YscreenUtils(Context context) {
        this.context = context;
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(dm);
        width = dm.widthPixels;
        height = dm.heightPixels;
    }

    public static YscreenUtils getInstance(Context context) {
        if (instance == null) {
            instance = new YscreenUtils(context);
        }
        return instance;
    }


    /**
     * 得到手机屏幕的宽度, pix单位
     */
    public int getScreenWidth() {
        return width;
    }

    /**
     * 得到手机屏幕的宽度, pix单位
     */
    public int getScreenHeight() {
        return height;
    }

}