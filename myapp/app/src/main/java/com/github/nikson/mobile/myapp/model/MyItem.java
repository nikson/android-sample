package com.github.nikson.mobile.myapp.model;

import com.orm.SugarRecord;


// @Table
public class MyItem extends SugarRecord {
//    private Long id;

    private String title;
    private String description;

    public MyItem() {
    }

    public MyItem(String title, String parentCategoryName) {
        this.title = title;
        this.description = parentCategoryName;
    }

}
