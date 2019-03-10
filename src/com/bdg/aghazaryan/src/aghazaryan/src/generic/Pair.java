package com.bdg.aghazaryan.src.aghazaryan.src.generic;

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

    public void setObj1(U obj1) {
        this.obj1 = obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }
}
