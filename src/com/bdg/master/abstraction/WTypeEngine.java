package com.bdg.master.abstraction;


public class WTypeEngine extends Engine {

    public WTypeEngine(final int hp, final int cylinderCount) {
        super(hp, cylinderCount);
    }

    @Override
    public void startEngine() {
        System.out.println("Staring WTypeEngine ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping WTypeEngine ");
    }
}
