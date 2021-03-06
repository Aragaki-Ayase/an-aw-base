/*
 * Copyright 2016 Yan Zhenjie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qyddai.an_aw_base.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.an.base.view.swipelayout.Closeable;
import com.an.base.view.swipelayout.OnSwipeMenuItemClickListener;
import com.an.base.view.swipelayout.SwipeMenu;
import com.an.base.view.swipelayout.SwipeMenuCreator;
import com.an.base.view.swipelayout.SwipeMenuItem;
import com.an.base.view.swipelayout.SwipeMenuRecyclerView;
import com.qyddai.an_aw_base.OnItemClickListener;
import com.qyddai.an_aw_base.R;
import com.qyddai.an_aw_base.model.adapter.MenuAdapter;
import com.qyddai.an_aw_base.model.adapter.MenuViewTypeAdapter;
import com.qyddai.an_aw_base.utils.ListViewDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/7/27.
 *
 * @author Yan Zhenjie.
 */
public class ViewTypeMenuActivity extends AppCompatActivity {

    private Activity mContext;

    private List<String> mStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sst_activity_swipelayout_comm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mContext = this;

        mStrings = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            mStrings.add(i % 2 == 0 ? "我有菜单。" : "我没有菜单。");
        }
        SwipeMenuRecyclerView swipeMenuRecyclerView = (SwipeMenuRecyclerView) findViewById(R.id.recycler_view);
        swipeMenuRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        swipeMenuRecyclerView.setHasFixedSize(true);
        swipeMenuRecyclerView.setItemAnimator(new DefaultItemAnimator());
        swipeMenuRecyclerView.addItemDecoration(new ListViewDecoration());

        swipeMenuRecyclerView.setSwipeMenuCreator(swipeMenuCreator);
        swipeMenuRecyclerView.setSwipeMenuItemClickListener(menuItemClickListener);

        MenuAdapter menuAdapter = new MenuViewTypeAdapter(mStrings);
        menuAdapter.setOnItemClickListener(onItemClickListener);

        swipeMenuRecyclerView.setAdapter(menuAdapter);
    }

    /**
     * 菜单创建器。
     */
    private SwipeMenuCreator swipeMenuCreator = new SwipeMenuCreator() {
        @Override
        public void onCreateMenu(SwipeMenu swipeLeftMenu, SwipeMenu swipeRightMenu, int viewType) {
            if (viewType == MenuViewTypeAdapter.VIEW_TYPE_NONE) {// 根据Adapter的ViewType来决定菜单的样式、颜色等属性、或者是否添加菜单。
                // Do nothing.
            } else if (viewType == MenuViewTypeAdapter.VIEW_TYPE_MENU) {
                int size = getResources().getDimensionPixelSize(R.dimen.item_height);

                SwipeMenuItem deleteItem = new SwipeMenuItem(mContext)
                        .setBackgroundDrawable(R.drawable.yy_drawable_selector_purple)
                        .setImage(R.mipmap.ic_action_wechat)
                        .setText("微信")
                        .setWidth(size)
                        .setHeight(size);

                swipeLeftMenu.addMenuItem(deleteItem);
                swipeRightMenu.addMenuItem(deleteItem);

                SwipeMenuItem wechatItem = new SwipeMenuItem(mContext)
                        .setBackgroundDrawable(R.drawable.yy_drawable__selector_green)
                        .setImage(R.mipmap.ic_action_add)
                        .setText("添加")
                        .setWidth(size)
                        .setHeight(size);

                swipeLeftMenu.addMenuItem(wechatItem);
                swipeRightMenu.addMenuItem(wechatItem);
            }
        }
    };

    private OnItemClickListener onItemClickListener = new OnItemClickListener() {
        @Override
        public void onItemClick(int position) {
            Toast.makeText(mContext, "我是第" + position + "条。", Toast.LENGTH_SHORT).show();
        }
    };

    /**
     * 菜单点击监听。
     */
    private OnSwipeMenuItemClickListener menuItemClickListener = new OnSwipeMenuItemClickListener() {
        @Override
        public void onItemClick(Closeable closeable, int adapterPosition, int menuPosition, int direction) {
            closeable.smoothCloseMenu();// 关闭被点击的菜单。

            if (direction == SwipeMenuRecyclerView.RIGHT_DIRECTION) {
                Toast.makeText(mContext, "list第" + adapterPosition + "; 右侧菜单第" + menuPosition, Toast.LENGTH_SHORT).show();
            } else if (direction == SwipeMenuRecyclerView.LEFT_DIRECTION) {
                Toast.makeText(mContext, "list第" + adapterPosition + "; 左侧菜单第" + menuPosition, Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}
