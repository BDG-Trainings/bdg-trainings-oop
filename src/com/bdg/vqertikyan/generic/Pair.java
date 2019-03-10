package com.bdg.vqertikyan.generic;

public final class Pair<U, V> {
    private U u;
    private V v;

    Pair(final U u, final V v){
        this.u = u;
        this.v = v;
    }

    Pair(){
    }

    public U getU(){
        return u;
    }

    public void setU(U u){
        this.u = u;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

}