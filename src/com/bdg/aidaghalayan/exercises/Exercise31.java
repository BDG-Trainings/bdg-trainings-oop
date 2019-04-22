package com.bdg.aidaghalayan.exercises;

public class Exercise31 {

    public static void main(String[] args) {
        int a = 8;
        int b = 26;
        int c = 17;
        int d = 13;


        if (a > b && a > c && a > d) {
            System.out.println(a);
        }
        if (b > a && b > c && b > d) {
            System.out.println(b);
        }
        if (c > a && c > b && c > d) {
            System.out.println(c);
        }
        if (d > a && d > c && d > b) {
            System.out.println(d);
        }
    }
}