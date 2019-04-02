package com.bdg.osahakyan.designpattern.chainofresposibilitypattern;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){this.level = level;}

    @Override
    protected void write(String massage) {
        System.out.println("File: :Logger: " + massage);
    }
}
