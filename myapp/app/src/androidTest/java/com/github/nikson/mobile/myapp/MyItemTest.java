package com.github.nikson.mobile.myapp;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.github.nikson.mobile.myapp.model.MyItem;

public class MyItemTest extends ApplicationTestCase<Application> {
    public MyItemTest() {
        super(Application.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        // SugarORM need some time to start up, else tests will fail
        Thread.sleep(3000);
    }

    public void myitem_save() {

        MyItem myItem = new MyItem("Mobile", "Electronics");
        myItem.save();
    }
}
