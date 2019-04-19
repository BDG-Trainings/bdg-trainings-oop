package com.bdg.vqertikyan.homeworkfrombook;

import java.util.Arrays;
import java.util.Scanner;

public class N___151_170___201_210___211_230___251_260___281_290 {

    public static void main(String[] args) {

        //Scanner count = new Scanner(System.in);
        //int n = Integer.parseInt(count.nextLine());

        int n = 10;
        int n1 = 32;
        int[] x;
        x = new int[]{5, 8, 4, 3, 4, 5, 7, 8, 0, 5};
        int count = 0;


        //164 ?????
        for (int h = 10; h < 31; h++) {
            if (h > n1) {
                System.out.println("164: " + h*h);
                return;
            }
        }

        //201
        int number = 5454654;

        while (number / 10 != 0) {
            number = number / 10;
            count++;
        }
        count++;
        System.out.println("201: " + count);


        //215
        int sum = 0;
        for(int b = 0; b < n; b++){
            if (b%2 == 0){
                sum = sum + x[b];
            }
        }
        System.out.println("215: " + sum);



        //257
        int max = 0;
        int index = 0;
        for (int j = 0; j < n; j++) {
            if (x[j] > max) {
                max = x[j];
                index = j;
            }
        }
        System.out.println("257: " + index);


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

        System.out.println("281: " + Arrays.toString(y));
    }
}
