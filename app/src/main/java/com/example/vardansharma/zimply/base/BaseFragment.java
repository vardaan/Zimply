package com.example.vardansharma.zimply.base;

import android.support.v4.app.Fragment;

import com.example.vardansharma.zimply.di.component.AppComponent;


/**
 * Created by vardansharma on 15/11/16.
 */

public class BaseFragment extends Fragment implements BaseView {
    public AppComponent getAppComponent() {
        BaseApp baseApp = (BaseApp) getActivity().getApplication();
        return baseApp.getApplicationComponent();
    }

    @Override
    public void showLoading() {
        //todo
    }

    @Override
    public void hideLoading() {
        //todo

    }

    @Override
    public void showEmptyScreen() {
        //todo

    }

    @Override
    public void hideEmptyScreen() {
        //todo

    }

    @Override
    public void showErrorScreen() {
        //todo

    }
}
