package com.bdg.vkaramyan.generics.valid;


public class MaxNumberServiceImpl implements MaxNumberService<Integer> {

    @Override
    public Integer getMax(final Integer firstNumber, final Integer secondNumber) {
        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }
}
