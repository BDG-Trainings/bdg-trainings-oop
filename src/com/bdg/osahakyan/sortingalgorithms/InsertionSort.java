package com.bdg.osahakyan.sortingalgorithms;

public class InsertionSort {

        static void insertionSort(int array[]) {

            for (int i = 1; i < array.length - 1; i++) {
                int key = array[i];
                int j = i -1;

                while(j >= 0 && array[j] > key){
                    array[j+1] = array[j];
                    j = j-1;
            }
                array[j + 1] = key;
        }
        }

        public static void main(String[] args){

            int array[] = {3, 4, 5, 1, 2, 3, 7, 4, 5};

            System.out.print("Array before BubbleSorting");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + ",");
            }

            insertionSort(array);
            System.out.print("Array after BubbleSorting");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + ",");
            }
        }
    }
