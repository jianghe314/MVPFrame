package com.example.reach.mvpframe.base;

/**
 * Created by ZX on 2018/11/16
 *
 * 用于网络请求回调接口
 */

public interface CallBack {

    /**
     * 网络请求成功
     */
    void onSuccess();

    /**
     * 网络请求失败
     */
    void onFail();

    /**
     * 网络接口返回数据错误
     */
    void onError();

    /**
     * 网络请求完成
     */
    void onComplete();

}
