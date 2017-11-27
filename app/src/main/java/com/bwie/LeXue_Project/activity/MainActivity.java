package com.bwie.LeXue_Project.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bwie.LeXue_Project.R;
import com.bwie.LeXue_Project.fragment.home_fragment;
import com.bwie.LeXue_Project.fragment.mine_fragment;
import com.bwie.LeXue_Project.fragment.recommend_fragment;
import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.bwie.LeXue_Project.R.id.btb;

public class MainActivity extends AppCompatActivity {

    @BindView(btb)
    BottomTabBar mBtb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        BottomTabBar btb= (BottomTabBar) findViewById(R.id.btb);
        btb.init(getSupportFragmentManager())
                .setImgSize(90, 90)
                .setFontSize(0)
                .setTabPadding(0, 0, 0)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("首页", R.drawable.home, home_fragment.class)
                .addTabItem("推荐", R.drawable.recommend,recommend_fragment.class)
                .addTabItem("我的", R.drawable.mine,mine_fragment.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });

    }

    @OnClick(btb)
    public void onClick(View v) {
        switch (v.getId()) {
            case btb:
                break;
        }
    }
}
