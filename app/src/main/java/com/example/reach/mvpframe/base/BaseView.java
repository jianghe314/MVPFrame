package com.example.reach.mvpframe.base;

/**
 * Created by ZX on 2018/11/16
 *
 * 用于定义一些常用的操作
 */
public interface   BaseView<T> {

    //初始化载入数据
    void loadData();

    //数据整体刷新
    void onRefresh(T data);

    //数据部分调整
    void onDataChange(T data);

    //参数化页面显示数据
    void onShowData(T data);

    //耗时操作显示等待
    void showLoading();

    //隐藏耗时UI
    void showHide();

    //错误提示
    void showError(String msg);

    //信息提示
    void showMsg(String msg);



}
