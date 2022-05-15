package com.rmqdemo.rmqdemo.model;

import java.io.Serializable;


public class SimpleMessage implements Serializable {

    private String name;
    private String description;


    public SimpleMessage(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + name +". Description " + description;
    }
}
