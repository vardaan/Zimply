package com.example.vardansharma.zimply.base;

import android.app.Application;

import com.example.vardansharma.zimply.R;
import com.example.vardansharma.zimply.di.component.AppComponent;
import com.example.vardansharma.zimply.di.component.DaggerAppComponent;
import com.example.vardansharma.zimply.di.module.ApplicationModule;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


/**
 * Created by Vardan sharma on 8/5/16.
 * Base application for our application enables calligraphy
 */
public class BaseApp extends Application {
    private AppComponent applicationComponent;

    public AppComponent getApplicationComponent() {
        return DaggerAppComponent.builder().applicationModule(new ApplicationModule(this))
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // enabling calligraphy
        CalligraphyConfig.initDefault(
                new CalligraphyConfig.Builder().setDefaultFontPath("fonts/Roboto-Regular.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build());

    }
}
