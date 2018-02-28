package com.yugao.mk.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by guojing on 2017/6/18 0018.
 */

public class BaseActivity extends AppCompatActivity {
    //输出日志
    public String TAG;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getComponentName().getClassName();
    }
}
