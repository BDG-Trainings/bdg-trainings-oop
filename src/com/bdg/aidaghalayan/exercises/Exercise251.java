package com.bdg.aidaghalayan.exercises;

public class Exercise251 {
    public static void main(String[] args) {
        int n = 6;
        int[] array = {2, 0, -5, -1, 20, -1};
        int max=array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max=array[i];


            }
        }
        System.out.println(max);
    }
}
