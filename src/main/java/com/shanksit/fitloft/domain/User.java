package com.shanksit.fitloft.domain;


import org.springframework.data.annotation.Id;

/**
 * Created by chenleiyu on 15/11/24.
 */

public class User {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public  String id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String sex;
}
