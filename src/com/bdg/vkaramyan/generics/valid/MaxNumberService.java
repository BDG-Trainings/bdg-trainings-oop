package com.bdg.vkaramyan.generics.valid;


public interface MaxNumberService<T extends Number> {

    T getMax(T firstNumber, T secondNumber);
}
