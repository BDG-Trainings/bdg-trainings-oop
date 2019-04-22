package com.bdg.aidaghalayan.exercises;

public class Exercise63 {
    public static void main(String[] args) {
        int i = 2222;
        int miav= i%10;
        int tasn=i/100%10;
        int haryur=i/10%10;
        int hazar=i/1000;

        if(miav==1 || tasn==1 || haryur==1 || hazar==1){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }


        System.out.println(miav);
        System.out.println(hazar);
        System.out.println(tasn);
        System.out.println(haryur);
    }

}

