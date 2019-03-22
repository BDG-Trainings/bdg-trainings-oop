package com.bdg.osahakyan.sortingalgorithms;

public class BubbleSort {

    static void bubbleSort(int array[]){

        for(int i = 0; i < array.length; i++ ){
            for(int j = 1; j < array.length - i; j++){
                if(array[j-1] > array[j]){

                    //swap elements
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        int array[] = {3,4,5,1,2,3,7,4,5};

        System.out.print("Array before BubbleSorting");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i] + ",");
        }

        bubbleSort(array);
        System.out.print("Array after BubbleSorting");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i] + ",");
        }
    }

}
