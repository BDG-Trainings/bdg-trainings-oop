package com.bdg.vqertikyan.homeworkfrombook;

import java.util.Arrays;
import java.util.Scanner;

public class N___151_170___201_210___211_230___251_260___281_290 {

    public static void main(String[] args) {

        //Scanner count = new Scanner(System.in);
        //int n = Integer.parseInt(count.nextLine());

        int n = 5;
        int[] x;
        x = new int[]{5, 4, 3, 4, 5};
        int count = 0;


        //281
        for (int i = 0; i < n; i++) {
            if (x[i] > 0) {
                count++;
            }
        }

        int[] y = new int[count];

        int i = 0;
        for (int k = 0; k < count; k++) {
            if (x[i] > 0) {
                y[k] = x[i];
            }
            i++;
        }

        System.out.println(Arrays.toString(y));
    }
}
