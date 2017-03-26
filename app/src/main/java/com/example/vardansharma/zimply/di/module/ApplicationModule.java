package com.example.vardansharma.zimply.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vardansharma on 15/11/16.
 */

@Module
public class ApplicationModule {
    private final Application application;
    private final static String prefName ="com.vardansharma.zimply";

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }
}
