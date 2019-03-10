package com.bdg.vqertikyan.generic;

public class NumberMax<U> {
    private U u;
    private U v;

    public <U extends Comparable> U getMaxNumber(U u, U v){
        if (u.compareTo(v)>0) {
            return u;
        } else {
            return v;
        }
    }
}

class App {
    public static void main(String[] args) {
        NumberMax numberMax = new NumberMax();
        System.out.println(numberMax.getMaxNumber(16.7, 16.7));
    }
}