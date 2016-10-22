package com.brigade.brigadiers.model;

import java.util.HashMap;

/**
 * Created by felipegutierrez on 10/21/16.
 */

public class Brigadier {

    String Name;
    Integer Age;
    String Sex;

    public HashMap<String, Object> getTimestampJoined() {
        return timestampJoined;
    }

    public void setTimestampJoined(HashMap<String, Object> timestampJoined) {
        this.timestampJoined = timestampJoined;
    }

    private HashMap<String, Object> timestampJoined;

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

}
