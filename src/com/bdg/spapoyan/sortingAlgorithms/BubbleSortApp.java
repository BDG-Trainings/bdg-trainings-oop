package com.bdg.spapoyan.sortingAlgorithms;

public class BubbleSortApp {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int maxSize = 99;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        arr.insert(100);
        arr.insert(99);
        arr.insert(98);
        arr.insert(97);
        arr.insert(96);
        arr.insert(95);
        arr.insert(94);
        arr.insert(93);
        arr.insert(92);
        arr.insert(91);
        arr.insert(90);

        arr.display();
        arr.bubbleSort();
        arr.display();

        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");

    }
}
