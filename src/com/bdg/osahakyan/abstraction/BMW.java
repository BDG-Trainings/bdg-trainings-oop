package com.bdg.osahakyan.abstraction;


import com.bdg.osahakyan.date.Date;

public class BMW extends Car {


    public BMW(final String color, final Date createdDate, final Engine engine) {
        super(color, createdDate, engine);
    }

    public void start() {
        System.out.println("Staring Bmw services");
        engine.startEngine();
    }

    public void stop() {
        System.out.println("Stopping Bmw services");
        engine.stopEngine();
    }
}
