package com.bdg.ekirakosyan.Lessons01_05.lesson_02;

import java.util.Scanner;

/*
 * Trvac e qaranish tiv
 * Kazmel hetevjal xndirneri blok sxeman ev cragir@
 * */

public class exercises61_70 {
    public static void main(String[] args) {
        System.out.println("Mutqagreq qaranish tiv.");

        Scanner in=new Scanner(System.in);
        int number=in.nextInt();

        int a=number%10;        //miavor
        int b=number/10%10;     //tasnavor
        int c=number/100%10;    //harjuravor
        int d=number/1000;      //hazaravor

        System.out.println("Miavor a="+a+"; Tasnavor b="+b+"; Haruravor c="+c+"; Hazaravor d="+d);
        System.out.println();

        /*
         *  N 61
         *  't' tramabanakan popoxakanin veragrel true,
         *  ete miavorneri ev tasnavorneri tvanshanneri gumar@ = harjuravorneri ev hazaravorneri tvanshanneri gumarin
         *  hakarak depqum 't=false'
         **/
        boolean t=false;
        if(a+b==c+d){
            t=true;
        }
        System.out.println("N61: t=" + t);

        /*
         *  N 62
         *  print qaranish tvi haraberutjan arjeq@ miavorneri ev harjuravorneri tvanshanneri gumarin
         *  ete qaranish tiv@ < 5000
         *  hakarak depqum qaranish tvi haraberutjan arjeq@ hazaravor ev tasnavor tvanshanneri gumarin
         **/
        double s=0;
        if(number < 5000){
            if(a+c!= 0){
                s = (double) number/(a+c);
            }
        } else {
            if (b+d!=0) {
                s = (double) number/(b+d);
            }
        }
        System.out.println("N62: " + s);

        /*
         *  N 63
         *  print 1 ete qaranish tvi tvanshanneri mech ka 1 tiv@
         *  hakarak depqum print 0
         **/
        if(a==1 || b==1 || c==1 || d==1){
            System.out.println("N63: 1");
        } else {
            System.out.println("N63: 0");
        }

        /*
         *  N 64
         *  char y popoxakanin veragrel 's',
         *  ete qaraish tvi mavorneri ev tasnavorneri tvanshanneri gumar@ = 5
         *  hakarak depqum y='d'
         **/
        char y = 'd';
        if (a+b==5){
            y='s';
        }
        System.out.println("N64: y="+y);

        /*
         *  N 65
         *  print 'y=12',
         *  ete mavorneri ev tasnavorneri tvanshanneri artadrjal@ = 12
         *  hakarak depqum 'y=0'
         **/
        int x=0;
        if (a*b==12){
            x=12;
        }
        System.out.println("N65: y="+x);

        /*
         *  N 66
         *  print 'YES',
         *  ete qaranish tvi archin ev verchin tvanshanneri mech ka 4 tiv@
         *  hakarak depqum print 'NO'
         **/
        if (a==4 || d==4){
            System.out.println("N66: YES");
        } else {
            System.out.println("N66: NO");
        }

        /*
         *  N 67
         *  print 'YES',
         *  ete qaranish tiv@ = ir tvanshanneri gumari qarakusun
         *  hakarak depqum print 'NO'
         **/
        int sum = a + b + c + d;
        if( number == Math.pow(sum,2) ){
            System.out.println("N67: YES");
        } else {
            System.out.println("N67: NO");
        }


        /*
         *  N 68
         *  print miavorneri ev harjuravorneri artadrjal@
         *  ete miavorneri tvanshan@ mec e tasnavorneric
         *  hakarak depqum print 1
         **/
        if(a>b){
            sum = a*c;
            System.out.println("N68: " + sum);
        } else {
            System.out.println("N68: 1");
        }

        /*
         *  N 69
         *  print y=1
         *  ete qaranish tvi tvanshanneri gumar@ > 20
         *  hakarak depqum print y=0
         **/
        if( (a+b+c+d)>20 ){
            System.out.println("N68: y=1");
        } else {
            System.out.println("N68: y=0");
        }

        /*
         *  N 70
         *  print y=0
         *  ete qaranish tvi tvanshanneri artadrjal@ > 200
         *  hakarak depqum print y=1
         **/
        if( (a*b*c*d)>200 ){
            System.out.println("N70: y=0");
        } else {
            System.out.println("N70: y=1");
        }
    }
}
