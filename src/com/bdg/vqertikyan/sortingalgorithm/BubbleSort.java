package com.bdg.vqertikyan.sortingalgorithm;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] array){
        int tmp = 0;
        int n = array.length;

        for (int i = 0; i < n; i++){
            for (int k = 1; k < n - i; k++){
                if(array[k-1] > array[k]){
                    tmp = array[k];
                    array[k] = array[k-1];
                    array[k-1] = tmp;
                }
            }
        }
    }



    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[] {5, 4, 10, 8, 7, 3};
        bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}