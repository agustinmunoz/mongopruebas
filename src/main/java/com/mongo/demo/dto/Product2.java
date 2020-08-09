package com.mongo.demo.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Product2 {
    @Id
    private int id;
    private String name;
    private String ape1;

    public Product2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }
}
