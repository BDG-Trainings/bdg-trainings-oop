package com.bdg.master.abstraction;




public abstract class Car {

    protected String color;
    protected Date createdDate;
    protected Engine engine;

    public Car(final String color, final Date createdDate, final Engine engine) {
        this.color = color;
        this.createdDate = createdDate;
        this.engine = engine;
    }


    public abstract void start();

    public abstract void stop();
}
