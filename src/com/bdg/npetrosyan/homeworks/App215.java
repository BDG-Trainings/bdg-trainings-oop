package com.bdg.npetrosyan.homeworks;
//Zuyg index unecox tarreri mijin tvabanakany
public class App215 {
    public static void main(String[] args) {
        int[] y = new int[5];
        y[0] = 100;
        y[1] = -5;
        y[2] = 15;
        y[3] = 4;
        y[4] = 3;
        int positiveIndex = 0;
        double count = 0;
        for (int i = 0; i<y.length; i++){
            if (i % 2 == 0 && i > 0){
                count++;
                positiveIndex=positiveIndex+y[i];
            }
        }
        System.out.println(positiveIndex/count);
    }
}
