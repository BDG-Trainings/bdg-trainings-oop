package com.bdg.osahakyan.sortingalgorithms;

public class SelectionSort {

    static void selectionSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[min_index]) {
                    min_index = j;

                    //swap elements
                    int temp = array[min_index];
                    array[min_index] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {3, 4, 5, 1, 2, 3, 7, 4, 5};

        System.out.print("Array before BubbleSorting");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ",");
        }

        selectionSort(array);
        System.out.print("Array after BubbleSorting");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ",");
        }
    }
}
