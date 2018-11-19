package com.example.reach.mvpframe.widgets;

import android.widget.Toast;

import com.example.reach.mvpframe.MyApplication;

/**
 * Created by ZX on 2018/11/19
 */
public class ShortToast {

    private static Toast toast;

    public static void ShowMsg(String msg){
        if(toast==null){
            toast=Toast.makeText(MyApplication.getApplcationContext(),msg,Toast.LENGTH_SHORT);
        }else {
            toast.setText(msg);
        }
        toast.show();

    }

}
