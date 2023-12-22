package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class AutoWash {
    private ArrayList<ICar>cars;
    public AutoWash(ArrayList<ICar> cars){
        this.cars=cars;
    }
    public void wash(){
        System.out.println(cars.get(new Random().nextInt(cars.size()-1)).getModel()+" washed");
    }
}
