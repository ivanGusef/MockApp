package com.ivangusev.mockapp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by Ivan Gusev (ivan.gusev1@epam.com) on 3/2/2015.
 */
public final class MockApplication extends Application implements Application.ActivityLifecycleCallbacks {

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onTerminate() {
        unregisterActivityLifecycleCallbacks(this);
        super.onTerminate();
    }

    @Override
    public void onActivityCreated(final Activity activity, final Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(final Activity activity) {

    }

    @Override
    public void onActivityResumed(final Activity activity) {

    }

    @Override
    public void onActivityPaused(final Activity activity) {

    }

    @Override
    public void onActivityStopped(final Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(final Activity activity, final Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(final Activity activity) {

    }
}
