package com.example.vardansharma.zimply.di.module;

import android.app.Activity;

import com.example.vardansharma.zimply.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vardansharma on 15/11/16.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    /**
     * Expose the activity to dependents in the graph.
     */
    @Provides
    @ActivityScope
    Activity activity() {
        return this.activity;
    }

}
