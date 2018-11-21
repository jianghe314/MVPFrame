package com.example.reach.mvpframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.reach.mvpframe.base.BaseActivity;
import com.example.reach.mvpframe.widgets.mLog;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void initView() {
        User user=UserFactory.createUser();
        mLog.e("user","-->"+user.getAge()+user.getName());
    }

    @Override
    public void loadData() {

    }

    @Override
    public void onRefresh(Object data) {

    }

    @Override
    public void onDataChange(Object data) {

    }

    @Override
    public void onShowData(Object data) {

    }
}
