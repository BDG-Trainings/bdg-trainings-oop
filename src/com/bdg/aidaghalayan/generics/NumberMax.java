package com.bdg.aidaghalayan.generics;

public class NumberMax<V> {
    private V t;
    private V v;

public <V extends Comparable>V getMaxNumber(V v, V t){
    if(v.compareTo(t)>0){
        return v;
    }else {
        return t;
    }

}
}




