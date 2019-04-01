package com.bdg.master.producerconsumer;

import java.util.Queue;

public final class Producer implements Runnable {

    private final Queue<String> container;

    public Producer(final Queue<String> container) {
        this.container = container;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (this.container) {
                while (this.container.size() == 20) { //<-- while should be in synchronized scope
                    try {
                        System.out.println("WAITING thread : " + Thread.currentThread().getName());
                        this.container.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                //And also we don't need another synch block
                this.container.add("Thread -> " + Thread.currentThread().getName() + " Current size : " + this.container.size());
                this.container.notify();
            }
        }

    }
}
