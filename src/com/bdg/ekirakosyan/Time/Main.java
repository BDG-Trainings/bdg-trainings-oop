package com.bdg.ekirakosyan.Time;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isInputValid = true;

        System.out.println("Enter Hour, Minute and Second");
        Scanner hour = new Scanner(System.in);
        Scanner minute = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        int h = hour.nextInt();
        int m = minute.nextInt();
        int s = second.nextInt();

        if(h<0 || h>23){
            System.out.println("Please enter valid number for Hours [0,23]");
            isInputValid = false;
        }
        if(m<0 || m>59){
            System.out.println("Please enter valid number for Minutes [0,59]");
            isInputValid = false;
        }
        if(s<0 || s>59){
            System.out.println("Please enter valid number for Second [0,59]");
            isInputValid = false;
        }

        if(isInputValid) {
            Time time = new Time(h, m, s);
            System.out.println(time.toString());
            //System.out.println(time.nextSecond());
            System.out.println(time.prevSecond());
        } else {
            System.out.println("Please check input values and try again.");
        }
    }
}
