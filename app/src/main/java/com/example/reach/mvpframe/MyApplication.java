package com.example.reach.mvpframe;

import android.app.Application;
import android.content.Context;

/**
 * Created by ZX on 2018/11/19
 */
public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }


    public static Context getApplcationContext(){
        return context;
    }

}
