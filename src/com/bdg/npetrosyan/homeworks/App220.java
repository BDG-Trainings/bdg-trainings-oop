package com.bdg.npetrosyan.homeworks;
//bacasakan ev drakan unecoxneri qanak@
public class App220 {
    public static void main(String[] args) {
        int[] y = new int[6];
        y[0] = 95;
        y[1] = -5;
        y[2] = -15;
        y[3] = 4;
        y[4] = 3;
        y[5] = 10;

        int negativeIndex = 0;
        int positiveIndex = 0;
        for(int i = 0; i < y.length; i++){
            if (y[i] > 0){
                positiveIndex++;
            }else {
                negativeIndex++;
            }
        }
        System.out.println("Positive Index "+positiveIndex + ", Negative Index "+negativeIndex);
    }
}
