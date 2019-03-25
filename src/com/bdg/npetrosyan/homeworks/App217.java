package com.bdg.npetrosyan.homeworks;
//Kent index unecox tarreri qarakusineri gumary
public class App217 {
    public static void main(String[] args) {
        int[] y = new int[5];
        y[0] = 100;
        y[1] = -5;
        y[2] = 2;
        y[3] = 4;
        y[4] = 3;
        int count = 0;
        int negativeIndex = 0;
        for(int i = 0; i<y.length; i++){
            if(i%2!=0 && i > 0){
                count++;
                negativeIndex = negativeIndex + y[i] * y[i];
            }
        }
        System.out.println(negativeIndex);

    }
}
