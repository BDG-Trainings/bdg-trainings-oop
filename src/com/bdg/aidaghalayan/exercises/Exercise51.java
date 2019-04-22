package com.bdg.aidaghalayan.exercises;

public class Exercise51 {
    public static void main(String[] args) {
        int i =202;
        int miavor=i%100%10;
        int tasnavor=i/10%10;
        int haryuravor=i/100;
        boolean t=false;
        if(miavor==tasnavor+haryuravor){
            t=true;

        }
        else {
            t=false;
        }
        System.out.println(t);
    }
}
