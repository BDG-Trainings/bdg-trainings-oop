package com.bdg.aidaghalayan.patterns.factoryPattern.proxy.Pattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("123");
        image.display();
    }
}
