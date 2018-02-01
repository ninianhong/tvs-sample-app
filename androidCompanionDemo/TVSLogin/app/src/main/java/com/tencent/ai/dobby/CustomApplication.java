package com.tencent.ai.dobby;

import android.app.Application;

import com.tencent.ai.tvs.LoginWupManager;
import com.tencent.ai.tvs.env.ELoginEnv;

public class CustomApplication extends Application {

    private LoginWupManager manager;

    @Override
    public void onCreate() {
        super.onCreate();
        manager = LoginWupManager.getInstance(getApplicationContext());
        manager.startup();
        manager.setLoginEnv(ELoginEnv.TEST);
    }
}
