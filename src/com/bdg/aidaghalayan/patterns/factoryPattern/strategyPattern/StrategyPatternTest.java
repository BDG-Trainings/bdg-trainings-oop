package com.bdg.aidaghalayan.patterns.factoryPattern.strategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Context context= new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));
        Context context1= new Context(new OperationMultiply());
        System.out.println(context1.executeStrategy(10, 5));
        Context context2= new Context(new OperationSubstract());
        System.out.println(context2.executeStrategy(10, 5));
    }
}
