package com.bdg.vqertikyan.homeworkfrombook;

public class N___31_40___51_60___61_70 {





    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;
        int count = 0;

        //36
        if (a%2 != 0){
           count++;
        }
        if (b%2 != 0){
            count++;
        }
        if (c%2 != 0){
            count++;
        }
        if (d%2 != 0){
            count++;
        }

        if (count >= 2){
            System.out.println("36: 1");
        } else {
            System.out.println("36: 2");
        }


        //37 ????

        if (d-c == c-b && c-b == b-a){
            System.out.println("37: true");
        } else {
            System.out.println("37: false");
        }

        int threeDigit = 425;

        //51
        if (threeDigit%10 == (threeDigit/10%10 + threeDigit/100)){
            System.out.println("51: true");
        } else {
            System.out.println("51: false");
        }

        int fourDigit = 4254;
        //66
        if(fourDigit%10 == 4 || fourDigit/10000 == 4){
            System.out.println("66: true");
        } else {
            System.out.println("66: false");
        }


    }
}
