package com.bdg.npetrosyan.homeworks;
// Bacasakan tarreri mijin tvabanakany
public class App214 {
    public static void main(String[] args) {
        int[] y = new int[5];
        y[0] = 100;
        y[1] = -5;
        y[2] = 1;
        y[3] = 4;
        y[4] = 3;
        int count = 0;
        int negativeSum = 0;
        for (int i =0; i < y.length; i++){
            if (y[i] < 0){
                count++;
                negativeSum = negativeSum + y[i];

            }
        }System.out.println(negativeSum/count);
    }
}
