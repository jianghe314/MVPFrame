package com.example.reach.mvpframe.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(setContentView());
        waitDialog=new WaitDialog(this);
        errorDialog=new ErrorDialog(this);
    }


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

    protected abstract int setContentView();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        waitDialog.onDestory();
    }
}
