package com.bdg.ekirakosyan.za;

public class NumberMax {

    public static <T extends Comparable> T getMaxNumber(T x, T y) {
        T max = x;
        if( x.compareTo(max) > 0 ){
            max = y;
        }

        return max;
    }

    public static void main(String args[]) {
        System.out.printf("Max of %d and %d is %d\n\n",
                3, 4, getMaxNumber( 3, 4 ));

        System.out.printf("Max of %.1f and %.1f is %.1f\n\n",
                6.6, 8.8, getMaxNumber( 6.6, 8.8));

        System.out.printf("Max of %s and %s is %s\n","pear",
                "apple", getMaxNumber("pear", "apple"));

    }
}
