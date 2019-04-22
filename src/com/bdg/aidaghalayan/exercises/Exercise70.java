package com.bdg.aidaghalayan.exercises;

public class Exercise70 {
    public static void main(String[] args) {
        int i = 9990;
        int miav= i%10;
        int tasn=i/100%10;
        int haryur=i/10%10;
        int hazar=i/1000;
        int y;

        if(miav*tasn*haryur*hazar>200){
            y=0;
        }
        else {
           y=1;
        }
        System.out.println(y);

        System.out.println(miav);
        System.out.println(hazar);
        System.out.println(tasn);
        System.out.println(haryur);
    }

}

