package com.bdg.aidaghalayan.exercises;

public class Exercise53 {
    public static void main(String[] args) {
        int i =202;
        int miavor=i%100%10;
        int tasnavor=i/10%10;
        int haryuravor=i/100;
        int k =205;
        if(i>k){
            System.out.println(i/(miavor+tasnavor+haryuravor));
        }
        else {
            System.out.println(miavor/i);
        }
}
}
