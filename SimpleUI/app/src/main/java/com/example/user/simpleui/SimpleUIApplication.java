package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by user on 2016/7/19.
 */
public class SimpleUIApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Order.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5KauaUE3Ehu6a9TwNmyR4cRgZI6ftS2WVqPeJmfv")
                .server("https://parseapi.back4app.com/")
                .clientKey("x8xnI2vU0vuil1w18yvDkAb7lQm09pYoCJWiC21F")
                .enableLocalDataStore()
                .build());
//                        .clientKey("");
    }
}
