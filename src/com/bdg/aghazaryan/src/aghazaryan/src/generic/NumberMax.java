package com.bdg.aghazaryan.src.aghazaryan.src.generic;

public class NumberMax <T> {

    public static <T extends Comparable<T>> T maximum(T x, T y) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;

        }

        if (x.compareTo(max) > 0) {
            max = x;
        }

        return max;
    }

    public static void main(String args[]) {
        System.out.printf("Max is %d\n\n",
               22,27, maximum(22, 27 ));
    }

}