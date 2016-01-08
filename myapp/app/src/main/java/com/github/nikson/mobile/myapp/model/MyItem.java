package com.github.nikson.mobile.myapp.model;

import com.orm.SugarRecord;

public class MyItem extends SugarRecord {
    private String description;
    private String title;

    public MyItem(String title, String parentCategoryName) {
        this.title = title;
        this.description = parentCategoryName;
    }
}
