package com.bdg.npetrosyan;

import java.util.Arrays;

public class Template {


    public static void main(String[] args) {
        int x = 0;
        int[] y = new int[5];
        y[0] = 1;
        y[1] = -5;
        y[2] = 100;
        y[3] = 4;
        y[4] = 3;
        int max = y[0];
        for (int i = 1; i < 3; i++) {
            if (y[i] > max) {
                max = y[i];
            }
        }
        int d = 0;
        for (int i = 0; i < y.length; i++) {
            d = d + y[i];
        }

        int g = 0;
        int count = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] < 7 && y[i] > -1) {
                g = g + y[i];
                count++;
            }

        }
        System.out.println(g / count);
        int iteration = 0;
        for (int k = 0; k < y.length - 1; k++) {
            for (int i = 0; i < y.length - 1 - k; i++) {
                if (y[i] > y[i + 1]) {
                    int tmp = y[i + 1];
                    y[i + 1] = y[i];
                    y[i] = tmp;
                }
                iteration++;
            }
        }
        int postitiveSum =0;
        int count2 = 0;
        for (int i = 0; i<y.length; i++){
            if(y[i]>0){
                postitiveSum = postitiveSum + y[i];
                count2++;
            }
        }
        System.out.println(postitiveSum/count2);




    }

}
