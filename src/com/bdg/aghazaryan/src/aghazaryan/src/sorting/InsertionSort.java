package com.bdg.aghazaryan.src.aghazaryan.src.sorting;
import java.util.Arrays;
public class InsertionSort {

    public static void InsertionSortImpl(int[] list) {

        int i, k, key, temp;
        for (i = 1; i < list.length; i++) {
            key = list[i];
            k = i - 1;
            while (k >= 0 && key < list[k]) {
                temp = list[k];
                list[k] = list[k+1];
                list[k+1] = temp;
                k--;
            }
        }
    }

   public static void main(String[] args) {

       int[] list = {3, 21, 55, 896, 39, 79};
      System.out.println("Result :" + " " + Arrays.toString(list));
    }
}
