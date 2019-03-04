package com.bdg.vqertikyan.bankaccountsystem;

import com.bdg.vqertikyan.bankaccountsystem.common.CommonUtils;

public class Application {
    public static void  main(String[] args){

        CommonUtils utils = new CommonUtils();
        String creditCardNumber = utils.randomString(16);
        System.out.println(creditCardNumber);
    }
}