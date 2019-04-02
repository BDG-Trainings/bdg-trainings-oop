package com.bdg.osahakyan.designpattern.chainofresposibilitypattern;

public class ErrorLogger  extends AbstractLogger{

    public ErrorLogger(int level){ this.level = level;}

    @Override
    protected void write(String massage) {
        System.out.println("Error Console: :Logger: " + massage);
    }
}
