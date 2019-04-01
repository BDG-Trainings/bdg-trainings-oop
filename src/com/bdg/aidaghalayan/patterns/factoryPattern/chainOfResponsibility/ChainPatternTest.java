package com.bdg.aidaghalayan.patterns.factoryPattern.chainOfResponsibility;

public class ChainPatternTest {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger= new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger= new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger= new ErrorLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "information");
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug");
        loggerChain.logMessage(AbstractLogger.ERROR, "error");
    }
}
