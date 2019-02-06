package com.bdg.osahakyan.abstraction.publishmnet;


public class FacebookDriver {

    private final String url;

    public FacebookDriver(final String url) {
        this.url = url;
    }

    public void publish(String payload) {
        System.out.println("Facebook publisher");
    }
}
