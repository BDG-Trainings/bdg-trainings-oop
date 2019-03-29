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
            while (this.container.size() == 20) {
                synchronized (this.container) {
                    try {
                        System.out.println("WAITING thread : " + Thread.currentThread().getName());
                        this.container.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
            synchronized (this.container) {
                this.container.add("Thread -> " + Thread.currentThread().getName());
                this.container.notify();
            }
        }

    }
}
