package com.bdg.aghazaryan.src.aghazaryan.src.generics;

public final class Pair <U, V>  {

    private U obj1;
    private V obj2;

    public Pair( U obj1,  V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;

    }
    public Pair() {
    }

        public U getObj1() {
        return obj1;
    }

        public V getObj2() {
        return obj2;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }
}
