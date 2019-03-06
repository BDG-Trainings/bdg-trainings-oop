package com.bdg.hhertevtsyan.bankaccountsystem;

import java.util.Random;

public class UniqueStringCreator {
    private String id = "#";


    private String getUniqueId() {
        Random rand = new Random();
        String values = "0123456789";
        for (int i = 0; i < 16; i++) {
            this.id = id + values.charAt(rand.nextInt(values.length()));
        }
        return id;
    }
}