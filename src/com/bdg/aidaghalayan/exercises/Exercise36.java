package com.bdg.aidaghalayan.exercises;

public class Exercise36 {
    public static void main(String[] args) {
        int a = 8;
        int b = 1;
        int c = 5;
        int d = 8;
        if(a%2==1 && b%2==1){
            System.out.println("1");
        }
        else if(b%2==1 && c%2==1){
            System.out.println("1");
        }
        else if(c%2==1 && d%2==1){
            System.out.println("1");
        }
        else if(a%2==1 && c%2==1){
            System.out.println("1");
        }
        else if(a%2==1 && d%2==1) {
            System.out.println("1");
        }
        else if(c%2==1 && b%2==1) {
            System.out.println("1");
        }
        else if(d%2==1 && b%2==1) {
            System.out.println("1");

        }else{
            System.out.println("2");
        }
    }
}