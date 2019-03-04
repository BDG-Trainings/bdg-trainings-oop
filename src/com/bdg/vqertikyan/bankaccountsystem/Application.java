package com.bdg.vqertikyan.bankaccountsystem;

import com.bdg.vqertikyan.bankaccountsystem.common.CommonUtils;

import java.util.Arrays;

public class Application {
    public static void  main(String[] args){

        CommonUtils utils = new CommonUtils();

        String noSpaces = utils.randomString(16);
        String creditCardNumber = noSpaces.substring(0,4)+" "+noSpaces.substring(4,8)+" "+noSpaces.substring(8,12)+" "+noSpaces.substring(12,16);
        System.out.println(creditCardNumber);
    }
}