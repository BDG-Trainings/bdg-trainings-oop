package com.bdg.ekirakosyan.Lessons01_05.lesson_04;

import java.util.Arrays;

/**
 **  Տրված են  n բնական թիվը և n տարրեր պարունակող X միաչափ զանգվածը:
 **  Կազմել այնպիսի նոր Y վեկտորի ստացման և տպման բլոկ սխեման ու ծրագիրը,
 *   որի տարրեը ստացվում են տրված վեկտորից հեռացնելով
 * */
public class exercises291_300 {
    public static void main(String[] args) {

        /*
        *   N 291
        *   դրական տարրերը
        */
        int X[] = {7,5,-8,0,-3,2,-15};
        int lenghtY = 0;
        for (int i = 0; i < X.length; i++){
            if(X[i] < 0){
                lenghtY++;
            }
        }
        if (lenghtY != 0){
            int j = 0;
            int Y[] = new int[lenghtY];
            for (int i = 0; i < X.length; i++){
                if(X[i] < 0){
                    Y[j] = X[i];
                    j++;
                }

            }
            System.out.println("N 291: " + Arrays.toString(Y));
        } else {
            System.out.println("N 291: There aren't negative numbers in array X");
        }

        /*
        *   N 292
        *   հեռացնելով 7-ին բազմապատիկ տարրերը
        */
        int X1[] = {7,5,-21,49,-3,2,-15};
        lenghtY = 0;
        for (int i = 0; i < X1.length; i++){
            if(X1[i] % 7 != 0){
                lenghtY++;
            }
        }
        if (lenghtY != 0){
            int j = 0;
            int Y1[] = new int[lenghtY];
            for (int i = 0; i < X1.length; i++){
                if(X1[i] % 7 != 0){
                    Y1[j] = X1[i];
                    j++;
                }
            }
            System.out.println("N 292: " + Arrays.toString(Y1));
        } else {
            System.out.println("N 292: No match found");
        }

        /*
        *   N 293
        *   հեռացնելով  տրված [a;b] միջակայքին պատկանող տարրերը
        */
        int X2[] = {7,5,-21,49,-3,2,-15};
        int a = 5;
        int b = 21;
        lenghtY = 0;
        for (int i = 0; i < X2.length; i++){
            if(X2[i] < a || X2[i] > b){
                lenghtY++;
            }
        }
        if (lenghtY != 0){
            int j = 0;
            int Y2[] = new int[lenghtY];
            for (int i = 0; i < X2.length; i++){
                if(X2[i] < a || X2[i] > b){
                    Y2[j] = X2[i];
                    j++;
                }
            }
            System.out.println("N 293: " + Arrays.toString(Y2));
        } else {
            System.out.println("N 293: No match found");
        }


        /*
        *   N 294
        *   հեռացնելով կենտ ինդեքս ունեցող տարրերը
        */
        int X3[] = {1,6,7,-6,33,77,89,90};
        lenghtY = (int) X3.length/2;
        int Y3[] = new int[lenghtY];
        int j =0;
        for (int i = 1; i < X3.length; i+=2){
            Y3[j] = X3[i];
            j++;
        }
        System.out.println("N 294: " + Arrays.toString(Y3));

        /*
        *   N 295
        *   հեռացնելով զույգ ինդեքս ունեցող տարրերը
        */
        int X4[] = {1,6,7,-6,33,77,89,90};
        lenghtY = (int) X3.length/2;
        int Y4[] = new int[lenghtY];
        j =0;
        for (int i = 0; i < X4.length; i+=2){
            Y4[j] = X4[i];
            j++;
        }
        System.out.println("N 295: " + Arrays.toString(Y4));

        /*
        *   N 296
        *   հեռացնելով այն տարրերը, որոնց տրված k թվին բաժանելիս կմնա 2 մնացորդ
        */
        int k = 5;
        int X5[] = {2,12,5,24,8,6,9};
        lenghtY = 0;
        for (int i = 0; i < X5.length; i++) {
            //System.out.println(X5[i] % k);
            if (X5[i] % k != 2){
                lenghtY++;
            }
        }
        int Y5[] = new int[lenghtY];
        j = 0;
        for (int i = 0; i < X5.length; i++) {
            if (X5[i] % k != 2) {
                Y5[j] = X5[i];
                j++;
            }
        }
        System.out.println("N 296: " + Arrays.toString(Y5));

        /*
        *   N 297
        *   հեռացնելով այն տարրերը, որոնց րացարձակ արժեքները մեծ են տրված k թվից
        */
        k = 3;
        int X6[] = {-5, -1, 0, 7, 99, 3, 2, 1, 1};
        lenghtY = 0;
        for (int i = 0; i < X6.length ; i++) {
            if (Math.abs(X6[i]) <= k){
                lenghtY++;
            }
        }
        j = 0;
        int Y6[] = new int[lenghtY];
        for (int i = 0; i < X6.length ; i++) {
            if (Math.abs(X6[i]) <= k){
                Y6[j] = X6[i];
                j++;
            }
        }
        System.out.println("N 297: " + Arrays.toString(Y6));


        /*
        *   N 298
        *  հեռացնելով զույգ արժեք ունեցող տարրերը
        */
        int X7[] = {-8, -1, 0, 8, 99, 3, 2, 1, 16};
        lenghtY = 0;
        for (int i = 0; i < X7.length ; i++) {
            if (X7[i] % 2 != 0){
                lenghtY++;
            }
        }
        int Y7[] = new int[lenghtY];
        j = 0;
        for (int i = 0; i < X7.length ; i++) {
            if (X7[i] % 2 != 0){
                Y7[j] = X7[i];
                j++;
            }
        }
        System.out.println("N 298: " + Arrays.toString(Y7));

        /*
        *   N 299
        *   հեռացնելով կենտ արժեք ունեցող տարրերը
        */
        int X8[] = {-8, -1, 0, 8, 99, 3, 2, 1, 16};
        lenghtY = 0;
        for (int i = 0; i < X8.length ; i++) {
            if (X7[i] % 2 == 0){
                lenghtY++;
            }
        }
        int Y8[] = new int[lenghtY];
        j = 0;
        for (int i = 0; i < X8.length ; i++) {
            if (X8[i] % 2 == 0){
                Y8[j] = X8[i];
                j++;
            }
        }
        System.out.println("N 299: " + Arrays.toString(Y8));

        /*
        *   N 300
        *   հեռացնելով այն տարրերը, որոնց քառակուսիները փոքր են տրված k թվից
        */
        int X9[] = {-8, -1, 0, 8, 99, 3, 2, 1, 16};
        lenghtY = 0;
        k = 65;
        for (int i = 0; i < X8.length ; i++) {
            if(Math.pow(X9[i], 2) > k){
                lenghtY++;
            }
        }
        int Y9[] = new int[lenghtY];
        j = 0;
        for (int i = 0; i < X9.length ; i++) {
            if(Math.pow(X9[i], 2) > k){
                Y9[j] = X9[i];
                j++;
            }
        }
        System.out.println("N 300: " + Arrays.toString(Y9));

    }
}
