package com.pluralsight.smart.oven.m3.scopes;

import javax.inject.Singleton;

@Singleton
public class Oven2 {

    private Lights lights;

    public Oven2(Lights lights) {
        System.out.println("Calling Oven2 constructor");
        this.lights = lights;
    }

    public void turnOn() {
        System.out.println("Turning on the Oven2");
    }
}
