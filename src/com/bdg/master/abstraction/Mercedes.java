package com.bdg.master.abstraction;




public class Mercedes extends Car {

    public Mercedes(final String color, final Date createdDate, final Engine engine) {
        super(color, createdDate, engine);
    }

    @Override
    public void start() {
        System.out.println("Staring Mercedes services");
        engine.startEngine();
    }

    @Override
    public void stop() {
        System.out.println("Stopping Mercedes services");
        engine.stopEngine();
    }
}
