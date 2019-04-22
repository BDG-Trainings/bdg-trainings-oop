package com.bdg.aidaghalayan.exercises;

import java.util.Comparator;

public class Exercise32<E>  {

    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int c = 17;
        int d = 13;
        if(a==b ||b ==c|| c==d){
            System.out.println("numbers is equal");
        }
       else if (a < b && a < c && a < d ) {

            System.out.println(a);
        }
        else if (b < a && b < c && b < d) {
            System.out.println(b);
        }
        else if (c <a && c < b && c < d) {
            System.out.println(c);
        }
        else if(d < a && d<c && d < b){
            System.out.println(d);
        }
    }
     }


