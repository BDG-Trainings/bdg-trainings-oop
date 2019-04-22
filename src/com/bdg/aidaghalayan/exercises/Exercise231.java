package com.bdg.aidaghalayan.exercises;

public class Exercise231 {
    public static void main(String[] args) {
        int n = 6;
        int[] array = {2, 0, -5, -1, 2, -1};
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                sum= sum+((array[i])*(array[i]));


            }
        }
        System.out.println(sum);
    }
}

