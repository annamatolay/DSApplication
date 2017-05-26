package com.matolaypal.app.dsapp;

class MyLog {
    static String getTag(Object o) {
        return o.getClass().getSimpleName() + " <#> ";
    }
}