package com.bdg.master.abstraction;


public abstract class Engine {

    protected int hp;
    protected int cylinderCount;

    public Engine(final int hp, final int cylinderCount) {
        this.hp = hp;
        this.cylinderCount = cylinderCount;
    }

    public abstract void startEngine();

    public abstract void stopEngine();
}
