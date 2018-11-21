package com.example.reach.mvpframe.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.reach.mvpframe.widgets.ErrorDialog;
import com.example.reach.mvpframe.widgets.WaitDialog;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZX on 2018/11/18
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    protected ErrorDialog errorDialog;
    protected WaitDialog waitDialog;
    //网络请求添加参数和值
    protected Map<String,Object> params_values=new HashMap<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        waitDialog=new WaitDialog(this);
        errorDialog=new ErrorDialog(this);
        initView();
    }



    protected  void initView(){
        Log.e("执行","--->0");
    };


    @Override
    public void showLoading() {
        waitDialog.show();
        waitDialog.setWatiContent("加载中");
    }

    @Override
    public void showHide() {
        waitDialog.dismiss();
    }

    @Override
    public void showError(String msg) {
        errorDialog.show();
        errorDialog.setTextMsg(msg);
    }

    @Override
    public void showMsg(String msg) {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(null!=waitDialog){
            waitDialog.onDestory();
        }

    }
}
