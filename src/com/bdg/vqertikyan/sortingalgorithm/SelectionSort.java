package com.bdg.vqertikyan.sortingalgorithm;

import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int[] array){
        int n = array.length;
        int tmp = 0;
        int tmp1 = 0;

        for (int i = 0; i < n - 1; i++){
            int min = array[i];
            for (int k = 1 + i; k < n; k++){
                if (array[k] < min){
                   min = array[k];
                   tmp = k;
                } else {
                    if (tmp1 == tmp){
                       tmp = i;
                    }
                }
            }

            array[tmp] = array[i];
            array[i] = min;
            tmp1 = tmp;
        }
    }

    public static void main(String[] args){
        SelectionSort selectionSort = new SelectionSort();
        int[] array = new int[] {5, 20, 1, 6, 30, 4, 10, 8, 7, 3, 2, 25};
        selectionSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

}