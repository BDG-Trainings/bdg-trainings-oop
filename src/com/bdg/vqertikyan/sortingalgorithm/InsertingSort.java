package com.bdg.vqertikyan.sortingalgorithm;

import java.util.Arrays;

public class InsertingSort {
    public static void insertionSort(int array[]) {

        int n = array.length;

        for (int k = 1; k < n; k++) {
            int temp = array[k];
            int i = k - 1;
            while ((i > -1) && (array[i] > temp)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = temp;
        }
    }

    public static void main(String[] args){
        SelectionSort selectionSort = new SelectionSort();
        int[] array = new int[] {5, 20, 1, 6, 30, 4, 10, 8, 7, 3, 2, 25};
        selectionSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}