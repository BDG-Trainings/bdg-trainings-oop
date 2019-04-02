package com.bdg.osahakyan.designpattern.proxypattern;

public class ProxyPatternDemo {

    public static void main(String[] args){
        Image image = new ProxyImage("Photo");

        image.display();
        System.out.println("");

        image.display();
    }
}
