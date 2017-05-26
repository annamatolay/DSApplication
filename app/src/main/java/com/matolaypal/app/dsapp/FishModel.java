package com.matolaypal.app.dsapp;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass()
public class FishModel extends RealmObject {

//    private String id;
    private String name;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FishModel{" +
//                "id='" + id + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
