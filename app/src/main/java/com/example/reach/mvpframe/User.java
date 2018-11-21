package com.example.reach.mvpframe;

import com.example.reach.mvpframe.base.Init;

/**
 * Created by ZX on 2018/11/20
 */
public class User {

    private String name;

    private String age;


    public String getName() {
        return name;
    }

    @Init(value = "srs")
    public void setName(String name) {
        this.name = name;
    }


    public String getAge() {
        return age;
    }

    @Init(value = "23")
    public void setAge(String age) {
        this.age = age;
    }
}
