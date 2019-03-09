package com.bdg.akarapetyan;

public class ToDelete {
    public static void main(String[] args) {

        ToDelete t = new ToDelete();


        int x =  t.depositIncome(500000, 365);
        System.out.println(x);
    }

    public  int depositIncome(int initialAmount, int days) {

        int income = initialAmount * days / 365 * 9 / 100;
        int netIncome = income - income * 10 / 100;
        return initialAmount + netIncome;

    }

}
