package com.bdg.aidaghalayan.exercises;

public class Exercise61 {
    public static void main(String[] args) {
        int i = 1221;
        int miav= i%10;
        int tasn=i/100%10;
        int haryur=i/10%10;
        int hazar=i/1000;
        boolean t=false;
        if(miav+tasn==haryur+hazar){
            t=true;
        }
        else {
            t=false;
        }
        System.out.println(t);

        System.out.println(miav);
        System.out.println(hazar);
        System.out.println(tasn);
        System.out.println(haryur);
    }

}
