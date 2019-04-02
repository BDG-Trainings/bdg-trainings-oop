package com.bdg.osahakyan.designpattern.chainofresposibilitypattern;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMassage(int level, String massage) {
        if (this.level <= level) {
            write(massage);
        }
        if (nextLogger != null) {
            nextLogger.logMassage(level, massage);
        }
    }

        protected abstract void write(String massage);
}


