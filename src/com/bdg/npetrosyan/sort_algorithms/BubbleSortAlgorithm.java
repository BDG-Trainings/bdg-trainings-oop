package com.bdg.npetrosyan.sort_algorithms;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] a = {5,15,26,24,58,74,49,612,14,5,26};
        bubbleSort(a);
        printArray(a);


    }

    static void bubbleSort(int[] a){
        boolean swapped = true;
        for (int i = 0; i < a.length-1; i++) {
            swapped=false;
            for (int j = 0; j < a.length-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    static void printArray(int[] a){
        System.out.println("The array is sorted");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
