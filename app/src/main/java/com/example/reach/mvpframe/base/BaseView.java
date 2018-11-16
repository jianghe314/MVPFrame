package com.example.reach.mvpframe.base;

/**
 * Created by ZX on 2018/11/16
 *
 * 用于定义一些常用的操作
 */
public interface BaseView {

    //数据整体刷新
    void onRefresh();

    //数据部分调整
    void onDataChange();

    //参数化页面显示数据
    void onShowData();


}
