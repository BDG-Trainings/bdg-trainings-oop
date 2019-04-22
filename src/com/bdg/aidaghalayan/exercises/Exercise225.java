package com.bdg.aidaghalayan.exercises;

public class Exercise225 {
    public static void main(String[] args) {
        int n = 6;
        int[] array = {2, 10, -5, -8, 6, -1};
        int t = 6;
        int artadryal = 1;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < t) {
                artadryal = artadryal * array[i];


            }
        }
        System.out.println(artadryal);
    }
}
