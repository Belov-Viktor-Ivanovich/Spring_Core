package org.example;

import org.springframework.beans.factory.annotation.Value;

public class SmallCar implements ICar{
    String model;

    public SmallCar(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return "маленькая машина "+model;
    }
}
