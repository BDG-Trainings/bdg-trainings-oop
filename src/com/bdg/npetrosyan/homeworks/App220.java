package com.bdg.npetrosyan.homeworks;
//bacasakan ev drakan unecoxneri qanak@
public class App220 {
//positive and negative numbers count
    public static void main(String[] args) {
        int[] y = new int[6];
        y[0] = 95;
        y[1] = -5;
        y[2] = -15;
        y[3] = 4;
        y[4] = 3;
        y[5] = 10;

        int negativeNumbers = 0;
        int positiveNumbers = 0;
        for(int i = 0; i < y.length; i++){
            if (y[i] > 0){
                positiveNumbers++;
            }else {
                negativeNumbers++;
            }
        }
        System.out.println("Positive Numbers Count "+positiveNumbers + ", Negative Numbers Count "+negativeNumbers);
    }
}
