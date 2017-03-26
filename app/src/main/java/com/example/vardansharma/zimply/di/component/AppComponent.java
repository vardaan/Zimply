package com.example.vardansharma.zimply.di.component;

import android.content.Context;

import com.example.vardansharma.zimply.base.BaseActivity;
import com.example.vardansharma.zimply.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component (modules = {ApplicationModule.class,
})
public interface AppComponent {
    void inject(BaseActivity baseActivity);

    //Exposed to sub-graphs.
    Context context();

}
