package com.bdg.aidaghalayan.exercises;

public class Exercise256 {
    public static void main(String[] args) {
        int n = 6;
        int[] array = {2, 0, 5, -3, 20, -1};
        int min=array[0];
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min=array[i];
                sum = min+i;

            }
        }
        System.out.println(sum);
    }
}


