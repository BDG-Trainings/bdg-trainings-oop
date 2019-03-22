package com.bdg.spapoyan.sorting;

public class BubbleSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        arr.insert(15);
        arr.insert(20);
        arr.insert(5);
        arr.insert(17);
        arr.insert(11);
        arr.insert(55);
        arr.insert(75);
        arr.insert(65);
        arr.insert(44);
        arr.insert(8);

        arr.display();
        arr.bubbleSort();
        arr.display();

    }
}
