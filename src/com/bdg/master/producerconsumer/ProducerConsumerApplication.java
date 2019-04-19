/*
package com.bdg.master.producerconsumer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProducerConsumerApplication {
    private static final int PRODUCER_COUNT = 5;
    private static final int CONSUMER_COUNT = 5;


    public static void main(String[] args) throws InterruptedException {
        final Queue<String> container = new LinkedList<>();


        final List<Thread> producers = new ArrayList<>(PRODUCER_COUNT);

        for (int i = 0; i < PRODUCER_COUNT; i++) {
            producers.add(new Thread(new Producer(container)));
        }

        final List<Thread> consumers = new ArrayList<>(CONSUMER_COUNT);

        for (int i = 0; i < CONSUMER_COUNT; i++) {
            consumers.add(new Thread(new Consumer(container)));
        }

        System.out.println("Starting producers ... ");


//        producers.forEach(Thread::start);


        for (Thread producer : producers) {
            producer.start();
        }

        Thread.sleep(2000);

        System.out.println("String consumers ... ");
//        consumers.forEach(Thread::start);

        for (Thread consumer : consumers) {
            consumer.start();
        }

//        producers.forEach(it -> {
//            try {
//                it.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });

        for (Thread producer : producers) {
            producer.join();
        }

//        consumers.forEach(it -> {
//            try {
//                it.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });

        for (Thread consumer : consumers) {
            consumer.join();
        }

//        container.forEach(System.out::println);
        for (String s : container) {
            System.out.println(s);
        }


    }
}
*/
