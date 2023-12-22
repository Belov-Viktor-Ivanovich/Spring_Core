package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:myApp.properties")
public class AppConfig {

    @Value("#{'${models}'.split(',')}")
    List<String> models;

    @Bean
    public AutoWash autoWashBean(){
        return new AutoWash(carListBean());
    }
    @Bean
    @Scope("prototype")
    public BigCar bigCarBean(){
        return new BigCar(getModelBean());
    }
    @Bean
    @Scope("prototype")
    public  SmallCar smallCarBean(){
        return new SmallCar(getModelBean());
    }
    @Bean
    public ArrayList<ICar>carListBean()
    {
        ArrayList<ICar>cars=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            cars.add(bigCarBean());
        }
        for (int i = 0; i < 6; i++) {
            cars.add(smallCarBean());
        }
        return cars;
    }
    @Bean
    public String getModelBean(){
        return models.get(new Random().nextInt(models.size()));
    }

}
