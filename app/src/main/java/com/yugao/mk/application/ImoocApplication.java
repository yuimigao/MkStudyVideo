package com.yugao.mk.application;

import android.app.Application;

/**
 * 1.整个程序的入口
 * 2.初始化工作
 * 3.为整个应用的其他模块提供上下文
 * Created by guojing on 2017/6/17 0017.
 */

public class ImoocApplication extends Application {

    private static ImoocApplication mImoocApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mImoocApplication = this;
    }

    public static ImoocApplication getInstance(){
        return mImoocApplication;
    }
}
