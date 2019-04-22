package com.bdg.aidaghalayan.exercises;

import java.util.Arrays;

public class Exercise281 {
    public static void main(String[] args) {
        int n = 6;
        int[] x = {2, 0, 5, -3, 20, -1};
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (x[i] > 0) {
                    y[k] = x[i];
                }
            }
        }
        System.out.println(Arrays.toString(y));
    }
}
