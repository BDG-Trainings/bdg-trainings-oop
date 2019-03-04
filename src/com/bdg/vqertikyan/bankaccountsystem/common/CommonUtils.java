package com.bdg.vqertikyan.bankaccountsystem.common;

import java.util.Random;

public class CommonUtils {
    public String randomString(int length) {
        String numLetter = "01234567890abcdefghijklmnopqrstuvwxyz";
        String randomStr = "";
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            randomStr += numLetter.charAt(r.nextInt(numLetter.length()));
        }
        return randomStr;
    }
}


