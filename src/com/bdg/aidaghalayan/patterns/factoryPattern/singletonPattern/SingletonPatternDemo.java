package com.bdg.aidaghalayan.patterns.factoryPattern.singletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object= SingleObject.getInsatnce();
        object.showMessage();
    }
}
