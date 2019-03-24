package com.bdg.spapoyan.sortingAlgorithms;

public class InsertSortApp {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int maxSize = 99;
        ArrayIns arr = new ArrayIns(maxSize);

        arr.insert(73);
        arr.insert(72);
        arr.insert(71);
        arr.insert(70);
        arr.insert(79);
        arr.insert(78);
        arr.insert(77);
        arr.insert(76);
        arr.insert(75);
        arr.insert(74);

        arr.display();
        arr.insertionSort();
        arr.display();

        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");
    }

}
