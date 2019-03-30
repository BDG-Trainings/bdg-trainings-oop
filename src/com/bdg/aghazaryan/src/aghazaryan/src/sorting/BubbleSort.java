package com.bdg.aghazaryan.src.aghazaryan.src.sorting;

  import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] list = new int[]{15, 31, 90, 35, 45, 150, 9, 83};

        list = bubbleSort(list, list.length );

    }

    private static int[] bubbleSort(int[] list, int temp) {

        for (int i = 0; i < list.length - 1; i++) {
            for ( int a = 0; a < list.length - 1 - i; a++){
                if (list[a] > list[a+1]){
                  temp = list[a];
                  list[a] = list[a + 1];
                    list[a + 1] = temp;

                }
            }

            System.out.println("Bubble sorting has the following results:" + " " + Arrays.toString(list));
        }
        return list;

    }

}
