package com.pluralsight.smart.oven.m3;

import com.pluralsight.smart.oven.m3.factory.CombiOven;
import io.micronaut.context.ApplicationContext;

public class FactoryApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = ApplicationContext.run();

        CombiOven combiOven = appContext.getBean(CombiOven.class);

        combiOven.turnOnMicrowave();
    }
}
