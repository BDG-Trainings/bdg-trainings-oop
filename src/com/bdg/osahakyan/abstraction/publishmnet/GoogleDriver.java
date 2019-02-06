package com.bdg.osahakyan.abstraction.publishmnet;


public class GoogleDriver {

    private final String url;

    public GoogleDriver(final String url) {
        this.url = url;
    }

    public void publish(final String s) {
        System.out.println("Google publisher");
    }
}
