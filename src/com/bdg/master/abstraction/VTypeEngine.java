package com.bdg.master.abstraction;


public class VTypeEngine extends Engine {


    public VTypeEngine(final int hp, final int cylinderCount) {
        super(hp, cylinderCount);
    }

    @Override
    public void startEngine() {
        System.out.println("Staring VTypeEngine ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping VTypeEngine ");
    }


}
