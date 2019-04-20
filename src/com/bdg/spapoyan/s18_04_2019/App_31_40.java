package com.bdg.spapoyan.s18_04_2019;

public class App_31_40 {

    public static void main(String[] args) {

        int a,b,c,d;
        a = 10; b = 11; c = 12; d = 13;

        if (a > b && a > c && a > d)  System.out.println("31) Max number : " + a);
        if (b > a && b > c && b > d)  System.out.println("31) Max number : " + b);
        if (c > a && c > b && c > d)  System.out.println("31) Max number : " + c);
        if (d > a && d > b && d > c)  System.out.println("31) Max number : " + d);

        if (a < b && a < c && a < d)  System.out.println("32) Min number : " + a);
        if (b < a && b < c && b < d)  System.out.println("32) Min number : " + b);
        if (c < a && c < b && c < d)  System.out.println("32) Min number : " + c);
        if (d < a && d < b && d < c)  System.out.println("32) Min number : " + d);

        if (a == 1 || b == 1 || c == 1 || d == 1) System.out.println("33) true");
        else System.out.println("33) false");

        if (a + b == c + d || a + c == b + d || a + d == b + c) System.out.println("34) true");
        else System.out.println("34) false");

        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) System.out.println("35) true");
        else System.out.println("35) false");

        if ( (a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && c % 2 != 0) || (a % 2 != 0 && d % 2 != 0) || (b % 2 != 0 && c % 2 != 0)
        || (b % 2 != 0 && d % 2 != 0) || (c % 2 != 0 && d % 2 != 0)) System.out.println("36) 1");
        else System.out.println("36) 2");

        int n = 2;
        if (b == a + n && c == b + n && d == c + n) System.out.println("37) true");
        else System.out.println("37) false");

        if (b == a * n && c == b * n && d == c * n) System.out.println("38) true");
        else System.out.println("38) false");

        if (b == a + 1 && c == b + 1 && d == c + 1) System.out.println("39) true");
        else System.out.println("39) false");


























    }



}
