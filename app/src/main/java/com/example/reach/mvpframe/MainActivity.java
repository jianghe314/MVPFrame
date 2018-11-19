package com.example.reach.mvpframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.reach.mvpframe.base.BaseActivity;
import com.example.reach.mvpframe.base.CallBack;
import com.example.reach.mvpframe.model.Model;
import com.example.reach.mvpframe.widgets.Loading;
import com.example.reach.mvpframe.widgets.WaitDialog;

public class MainActivity extends BaseActivity {

    private WaitDialog waitDialog;


    @Override
    protected int setContentView() {
        return R.layout.activity_main;
    }



    @Override
    public void loadData() {
        Model model=new Model();

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


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
