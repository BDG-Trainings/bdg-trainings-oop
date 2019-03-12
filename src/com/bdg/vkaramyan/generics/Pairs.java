package com.bdg.vkaramyan.generics;


//Valid
public final class Pairs<U, V> {

    private U u;
    private V v;


    public Pairs(final U u, final V v) {

        this.u = u;
        this.v = v;
    }


    public Pairs() {

    }


    public U getU() {
        return u;
    }


    public V getV() {
        return v;
    }


    @Override
    public String toString() {
        return "Pairs [u=" + u + ", v=" + v + "]";
    }


}
