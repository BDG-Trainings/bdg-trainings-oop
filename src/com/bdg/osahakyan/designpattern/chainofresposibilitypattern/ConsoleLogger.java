package com.bdg.osahakyan.designpattern.chainofresposibilitypattern;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String massage) {
        System.out.println("Standard Console: :Logger: " + massage);
    }
}
