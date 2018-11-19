package com.example.reach.mvpframe.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.reach.mvpframe.widgets.ErrorDialog;
import com.example.reach.mvpframe.widgets.WaitDialog;

/**
 * Created by ZX on 2018/11/18
 */
public abstract class BaseFragment extends Fragment implements BaseView{

    private View view;
    private ErrorDialog errorDialog;
    private WaitDialog waitDialog;
    //是否已经加载过了
    private boolean isLoad=false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(setContentView(),container,false);
        errorDialog=new ErrorDialog(getContext());
        waitDialog=new WaitDialog(getContext());
        return view;

    }


    protected abstract int setContentView();

    protected <T extends View> View findViewById(int id){
        return view.findViewById(id);
    };

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(getUserVisibleHint()&&!isLoad){
            lazyLoadData();
        }else{
            stopLoad();
        }
    }

    //加载网络数据
    protected abstract void lazyLoadData();

    //暂定加载
    protected abstract void stopLoad();


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        waitDialog.onDestory();
    }
}
