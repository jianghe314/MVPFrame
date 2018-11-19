package com.example.reach.mvpframe.model;

import android.content.Context;

import com.yanzhenjie.nohttp.InitializationConfig;
import com.yanzhenjie.nohttp.NoHttp;
import com.yanzhenjie.nohttp.cache.DBCacheStore;

/**
 * Created by ZX on 2018/11/19
 *
 * 此方法是需要在Application中参数化网络请求工具类
 */
public class HttpProxy {

    public HttpProxy() {
    }

    protected void init(Context context){
        //配置nohttp链接超时和缓存到数据库
        InitializationConfig.Builder builder=InitializationConfig.newBuilder(context);
        builder.connectionTimeout(10*1000)
                .readTimeout(10*1000)
                .cacheStore(new DBCacheStore(context).setEnable(true)).build();
        InitializationConfig config= builder.build();
        NoHttp.initialize(config);
    }


}
