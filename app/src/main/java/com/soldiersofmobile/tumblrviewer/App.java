package com.soldiersofmobile.tumblrviewer;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by madejs on 26.02.16.
 */
public class App extends Application {

    public static final Bus bus = new Bus();



    @Override
    public void onCreate() {
        super.onCreate();
    }
}
