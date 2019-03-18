package com.bdg.aghazaryan.src.aghazaryan.src.generics;

import java.lang.reflect.Type;

public class NumberMax {

    //replace generic method with regular and resolve upper bounds in class name
    //use numeric type instead of comparable
    public static <T extends Number > T maximum(T x, T y) {
        T max = x;
        if (y.intValue() > 0) {
            max = y;

        }

        if (x.intValue() > 0) {
            max = x;
        }

        return max;
    }

    public static void main(String args[]) {
        System.out.printf("Max is %d\n\n",
                22, 27, maximum(22, 27));
    }

}