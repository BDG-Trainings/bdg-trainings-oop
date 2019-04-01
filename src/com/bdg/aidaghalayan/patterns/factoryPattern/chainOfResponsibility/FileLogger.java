package com.bdg.aidaghalayan.patterns.factoryPattern.chainOfResponsibility;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File: Logger"+message);

    }
}
