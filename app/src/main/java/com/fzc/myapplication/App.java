package com.fzc.myapplication;

import android.app.Application;
import android.os.Environment;

import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;

/**
 * Created by mark on 17-3-20.
 */

public class App extends Application {
    static {
        System.loadLibrary("stlport_shared");
        System.loadLibrary("marsxlog");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        String logPath = Environment.getExternalStorageDirectory().getPath() + "/xlog";

        System.out.println("fuck " + logPath);
        if (BuildConfig.DEBUG) {
            Xlog.appenderOpen(Xlog.LEVEL_DEBUG, Xlog.AppednerModeAsync, "", logPath, "MarsSample");
            Xlog.setConsoleLogOpen(true);

        } else {
            Xlog.appenderOpen(Xlog.LEVEL_INFO, Xlog.AppednerModeAsync, "", logPath, "MarsSample");
            Xlog.setConsoleLogOpen(false);
        }

        Log.setLogImp(new Xlog());

        Log.d("App", "fuck");
    }
}
