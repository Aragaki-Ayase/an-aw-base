package com.an.base.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.an.base.R;
import com.an.base.contract.SimpleDayNightContract;
import com.an.base.utils.AndroidTranslucentBar;
import com.an.base.utils.NetBroadcastReceiver;
import com.an.base.utils.NetBroadcastReceiverUtils;

import static com.an.base.AnApplication.AnTAG;


/**
 * Created by stary on 2016/8/18.
 * 文件名称：SuperActivity
 * 文件描述：
 * 作者：staryumou@163.com
 * 修改时间：2016/8/18
 */

public abstract class SuperActivity extends BaseActivity implements NetBroadcastReceiver.NetEvevt, SimpleDayNightContract {
    protected SharedPreferences sp;
    public static NetBroadcastReceiver.NetEvevt evevt;//广播监听网络
    protected Context mContext;
    /**
     * 网络类型
     */
    private int netModel;
    protected Window mWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO 固件化的操作
        super.onCreate(savedInstanceState);
        //环信集成功能，暂未开启。
//		EMChat.getInstance().init(this.getApplicationContext());
        mContext = this;
        //an框架的夜间模式。用来保存皮肤切换模式的sp，为了兼容性android6.0 到7.0做了如下判断。
        //android7.0提供兼容性。
        if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.M) {
            sp = this.getSharedPreferences(AnTAG, Context.MODE_PRIVATE);
        }
        if (Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            sp = PreferenceManager.getDefaultSharedPreferences(mContext);
        }
        //夜间模式第一种方式
        windowTranslucent();
        //初始化视图
        initView();
        //网络变化监听相关
        evevt = this;
        inspectNet();
    }

    public void windowTranslucent() {
        mWindow = getWindow();
        AndroidTranslucentBar.getInstance().setTranslucentBar(mWindow);
        if (sp.getBoolean("isNight", false)) {
            mWindow.getDecorView().setBackground(ContextCompat.getDrawable(mContext, R.drawable.yy_drawable_bgnigt_shape));
        } else {
            mWindow.getDecorView().setBackground(ContextCompat.getDrawable(mContext, R.drawable.yy_drawable_bgday_shape));
        }
    }

    @Override
    public void onWindowTranslucentBar(int colorId) {
        mWindow.getDecorView().setBackground(ContextCompat.getDrawable(mContext, colorId));
    }

    /**
     * 初始化时判断有没有网络
     */

    public boolean inspectNet() {
        this.netModel = NetBroadcastReceiverUtils.getNetworkState(SuperActivity.this);
        return isNetConnect();
    }

    /**
     * 网络变化之后的类型
     */
    @Override
    public void onNetChange(int netModel) {
        // TODO Auto-generated method stub
        this.netModel = netModel;
        isNetConnect();
    }

    /**
     * 判断有无网络 。
     *
     * @return true 有网, false 没有网络.
     */
    public boolean isNetConnect() {
        if (netModel == 1) {
            return true;
        } else if (netModel == 0) {
            return true;
        } else if (netModel == -1) {
            return false;
        }
        return false;
    }

    /**
     * 简化Toast。
     *
     * @return null.
     */
    protected void showToast(final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }

    protected void showToastInCenter(final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast toast = Toast.makeText(mContext, msg, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 10);
                toast.show();
            }
        });

    }

    protected void showSnackbar(final View ytipsView, final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Snackbar.make(ytipsView, msg, Snackbar.LENGTH_SHORT).show();
//                setAction("Undo",
//                        new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                Toast.makeText(getApplication(), "请输入内容后再试试", Toast.LENGTH_SHORT).show();
//                            }
//                        })
            }
        });
    }

    /**
     * 各种对象、组件的初始化
     */
    public abstract void initView();
}

