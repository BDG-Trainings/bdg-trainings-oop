/*
package com.bdg.master.threads;


public class Synchronization {

    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_00_000; i++) {
                    incrementCount();
                }
            }
        });
        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_00_000; i++) {
                    incrementCount_1();
                }

            }
        });

        first.start();
        second.start();


        first.join();
        second.join();


        System.out.println("COUNT : " + counter);

    }

    public synchronized static void incrementCount() {

        counter++;
    }
    public synchronized static void incrementCount_1() {

        counter++;
    }
}
*/
