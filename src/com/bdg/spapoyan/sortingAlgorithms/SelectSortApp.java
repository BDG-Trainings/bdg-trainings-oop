package com.bdg.spapoyan.sortingAlgorithms;

public class SelectSortApp {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int maxSize = 99;
        ArraySel arr;
        arr = new ArraySel(maxSize);
        arr.insert(89);
        arr.insert(88);
        arr.insert(87);
        arr.insert(86);
        arr.insert(85);
        arr.insert(84);
        arr.insert(83);
        arr.insert(82);
        arr.insert(81);
        arr.insert(80);

        arr.display();
        arr.selectionSort();
        arr.display();

        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");
    }
}
