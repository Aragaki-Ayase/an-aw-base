package com.qyddai.an_aw_base.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.an.base.utils.NetBroadcastReceiverUtils;
import com.an.base.view.recyclerview.ItemDecoration.GridItemDecoration;
import com.an.base.view.recyclerview.ItemDecoration.SpacesItemDecoration;
import com.an.base.view.recyclerview.ListBaseAdapter;
import com.an.base.view.recyclerview.SuperViewHolder;
import com.an.base.view.recyclerview.interfaces.OnLoadMoreListener;
import com.an.base.view.recyclerview.interfaces.OnNetWorkErrorListener;
import com.an.base.view.recyclerview.interfaces.OnRefreshListener;
import com.an.base.view.recyclerview.recyclerview.LRecyclerView;
import com.an.base.view.recyclerview.recyclerview.LRecyclerViewAdapter;
import com.qyddai.an_aw_base.R;
import com.qyddai.an_aw_base.model.adapter.DataAdapter;
import com.qyddai.an_aw_base.model.entity.ItemModel;
import com.qyddai.an_aw_base.utils.SampleHeader;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;

/**
 * 带HeaderView的分页加载GridLayout RecyclerView
 */
public class EndlessStaggeredGridLayoutActivity extends AppCompatActivity {

    /**服务器端一共多少条数据*/
    private static final int TOTAL_COUNTER = 34;

    /**每一页展示多少条数据*/
    private static final int REQUEST_COUNT = 10;

    /**已经获取到多少条数据了*/
    private static int mCurrentCounter = 0;

    private LRecyclerView mRecyclerView = null;

    private DataAdapter mDataAdapter = null;

    private PreviewHandler mHandler = new PreviewHandler(this);
    private LRecyclerViewAdapter mLRecyclerViewAdapter = null;
    private boolean isRefresh = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sst_activity_recyclerview_endless);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (LRecyclerView) findViewById(R.id.list);

        mDataAdapter = new DataAdapter(this);

        mLRecyclerViewAdapter = new LRecyclerViewAdapter(mDataAdapter);
        mRecyclerView.setAdapter(mLRecyclerViewAdapter);

        //setLayoutManager
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager( 2, StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //防止item位置互换
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        mRecyclerView.setLayoutManager(layoutManager);

        mLRecyclerViewAdapter.addHeaderView(new SampleHeader(this));

        mRecyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                mCurrentCounter = 0;
                mDataAdapter.clear();
                requestData();
            }
        });

        mRecyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (mCurrentCounter < TOTAL_COUNTER) {
                    // loading more
                    requestData();
                } else {
                    //the end
                    mRecyclerView.setNoMore(true);
                }
            }
        });


        mRecyclerView.refresh();

    }

    private void addItems(ArrayList<ItemModel> list) {
        mDataAdapter.addAll(list);
        mCurrentCounter += list.size();
    }

    private void notifyDataSetChanged() {
        mLRecyclerViewAdapter.notifyDataSetChanged();
    }

    private class PreviewHandler extends Handler {

        private WeakReference<EndlessStaggeredGridLayoutActivity> ref;

        PreviewHandler(EndlessStaggeredGridLayoutActivity activity) {
            ref = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            final EndlessStaggeredGridLayoutActivity activity = ref.get();
            if (activity == null || activity.isFinishing()) {
                return;
            }

            switch (msg.what) {
                case -1:

                    int currentSize = activity.mDataAdapter.getItemCount();

                    //模拟组装10个数据
                    ArrayList<ItemModel> newList = new ArrayList<>();
                    for (int i = 0; i < 10; i++) {
                        if (newList.size() + currentSize >= TOTAL_COUNTER) {
                            break;
                        }
                        ItemModel item = new ItemModel();
                        item.id = currentSize + i;
                        item.title = "item" + (item.id);
                        item.height = new Random().nextInt(1000);
                        if(item.height < 100) {
                            item.height += 400;
                        }

                        newList.add(item);
                    }

                    activity.addItems(newList);

                    activity.mRecyclerView.refreshComplete(REQUEST_COUNT);
                    break;
                case -2:
                    activity.notifyDataSetChanged();
                    break;
                case -3:
                    activity.mRecyclerView.refreshComplete(REQUEST_COUNT);
                    activity.notifyDataSetChanged();
                    activity.mRecyclerView.setOnNetWorkErrorListener(new OnNetWorkErrorListener() {
                        @Override
                        public void reload() {

                            requestData();
                        }
                    });
                    break;
            }
        }
    }

    /**
     * 模拟请求网络
     */
    private void requestData() {

        new Thread() {

            @Override
            public void run() {
                super.run();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //模拟一下网络请求失败的情况
                if(NetBroadcastReceiverUtils.isConnectedToInternet(EndlessStaggeredGridLayoutActivity.this)) {
                    mHandler.sendEmptyMessage(-1);
                } else {
                    mHandler.sendEmptyMessage(-3);
                }
            }
        }.start();
    }

    private class DataAdapter  extends ListBaseAdapter<ItemModel> {

        public DataAdapter(Context context) {
            super(context);
        }


        @Override
        public int getLayoutId() {
            return R.layout.item_recyclerview_endless_gridecard;
        }

        @Override
        public void onBindItemHolder(SuperViewHolder holder, int position) {
//            CardView cardView =  holder.getView(R.id.card_view);
            TextView textView = holder.getView(R.id.info_text);

            ItemModel itemModel = mDataList.get(position);

            textView.setText(itemModel.title);

            //修改高度，模拟交错效果
            textView.getLayoutParams().height = itemModel.height;
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }
}