package com.example.vardansharma.zimply;

import android.view.Gravity;

import com.codemonkeylabs.fpslibrary.TinyDancer;
import com.example.vardansharma.zimply.base.BaseApp;
import com.squareup.leakcanary.LeakCanary;

import timber.log.Timber;

/**
 * Created by vardansharma on 26/03/17.
 */

public class ZimplyDebugApp extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        //enabling Timber
        Timber.plant(new Timber.DebugTree());

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);

        TinyDancer.create()
                .redFlagPercentage(.1f) // set red indicator for 10%
                .startingGravity(Gravity.TOP)
                .startingXPosition(200)
                .startingYPosition(600)
                .show(this);

    }

}
