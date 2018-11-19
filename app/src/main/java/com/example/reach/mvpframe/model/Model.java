package com.example.reach.mvpframe.model;

import com.example.reach.mvpframe.base.CallBack;

import java.util.Map;

/**
 * Created by ZX on 2018/11/19
 *
 * 网络请求的代理类，可根据自己的需求切换网络请求工具
 */
public class Model {


    public <T> void posData(Map<String,Object> params_values, String url,CallBack<T> callBack ){

    }

    public <T> void getData(String url,CallBack<T> callBack){

    }



}
