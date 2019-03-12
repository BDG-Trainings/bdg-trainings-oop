package com.bdg.aiskandaryan.Lesson_Generics;

public final class Pair <U, V> {
    private U u;
    private V v;

    public U getU() {
        return u;
    }

    public void setU(final U u) {
        this.u = u;
    }

    public V getV() {
        return v;
    }

    public void setV(final V v) {
        this.v = v;
    }

    public Pair() {

    }

    public Pair(final U u, final V v) {
        this.u = u;
        this.v = v;
    }
}