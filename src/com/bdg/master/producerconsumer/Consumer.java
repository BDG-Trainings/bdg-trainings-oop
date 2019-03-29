package com.bdg.master.producerconsumer;

import java.util.Queue;

public final class Consumer implements Runnable {

    private final Queue<String> container;

    public Consumer(final Queue<String> container) {
        this.container = container;
    }


    @Override
    public void run() {
        while (true) {
            while (this.container.isEmpty()) {
                synchronized (this.container) {
                    try {
                        this.container.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }

            synchronized (this.container) {
                this.container.notifyAll();
                System.out.println("Consuming value : " + this.container.poll());
            }
        }

    }
}
