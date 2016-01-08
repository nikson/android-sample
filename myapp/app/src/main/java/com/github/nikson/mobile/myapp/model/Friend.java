package com.github.nikson.mobile.myapp.model;

import java.util.ArrayList;
import java.util.List;

public class Friend {
    private boolean active;
    private String name;

    public Friend(String name, boolean online) {
        this.name = name;
        this.active = online;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static List<Friend> getDummyData() {
        List<Friend> data = new ArrayList();
        data.add(new Friend("Friend 1", true));
        data.add(new Friend("Friend 2", false));
        data.add(new Friend("Friend 3", true));
        return data;
    }
}
