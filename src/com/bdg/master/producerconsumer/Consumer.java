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
            synchronized (this.container) {
                while (this.container.isEmpty()) {

                    try {
                        this.container.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                this.container.notifyAll();
                System.out.println("Consuming value : " + this.container.poll());
            }
        }

    }
}
