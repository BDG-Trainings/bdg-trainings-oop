package com.bdg.npetrosyan.homeworks;
// Drakan tarreri mijin tvabanakany
public class App211 {
    public static void main(String[] args) {
        int[] y = new int[5];
        y[0] = 100;
        y[1] = -5;
        y[2] = 1;
        y[3] = 4;
        y[4] = 3;

        int positiveSum =0;
        int count = 0;
        for(int i = 0; i<y.length; i++){
            if (y[i] > 0){
                count++;
                positiveSum = positiveSum + y[i];
            }
        }
        System.out.println(positiveSum/count);



    }
}
