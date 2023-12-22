package org.example;

import org.springframework.beans.factory.annotation.Value;

public class BigCar implements ICar{
    String model;

    public BigCar(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return "большая машина "+model;
    }
}
