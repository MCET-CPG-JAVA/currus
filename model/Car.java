package com.k2n.currus.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends BasEntity{

    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}