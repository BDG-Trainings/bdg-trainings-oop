package com.bdg.ekirakosyan.Lessons01_05.lesson_05;

/**
 **  Տրված են m ամբողջ թիվը և m x m չափի մատրց, որի տարրերը բնական թվեր են:
 **  Կազմել բլոկ սխեման ու ծրագիր, որոնք կհաշվեն և կտպեն մատրիցի
 **/
public class exercises421_430 {
    public static void main(String[] args) {
        int A1[][]={
                {50,60,55,67,70},
                {62,65,30,70,81},
                {72,66,17,80,69},
                {82,10,55,87,15},
                {0,21,17,40,69}
        };
        final int m =  5;
        final int maxIndex = m - 1;

        System.out.println("m x m  մատրց");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A1[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("գլխավոր անկյունագծ` --");
        System.out.println("գլխավոր անկյունագծ ներքև գտնվող տարրեր` **");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(i<j) {
                    //i<j -> ankjunagcic verev
                    System.out.print(A1[i][j] + ", ");
                } else if(i==j){
                    //i==j -> ankjunagci vra
                    System.out.print( "--, ");
                } else {
                    //i>j -> ankjunagcic nerqev
                    System.out.print( "**, ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("օժանդակ անկյունագծ` **");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(j == maxIndex-i){
                    System.out.print("**, ");
                } else{
                    System.out.print(A1[i][j] + ", ");
                }
            }
            System.out.println();
        }
        System.out.println();

        /*
         *   N 421
         *   գլխավոր անկյունագծից ներքև գտնվող այն տարրերի քանակը,
         *   որոնք բազմապատիկ են տրված k ամբողջ թվին:
         */
        int k = 5;
        int count = 0;
        System.out.println("գլխավոր անկյունագծից ներքև գտնվող տարրերը");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print( A1[i][j]+", ");
                if (A1[i][j]%k==0){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("N 421: "+count);

        /*
         *   N 422
         *   գլխավոր անկյունագծից ներքև գտնվող այն տարրերի միջին թվաբանականը,
         *   որոնք բազմապատիկ են 5 թվին:
         */
        count = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (A1[i][j]%5==0){
                    count++;
                    sum += A1[i][j];
                }
            }
        }
        System.out.println("N 422: "+ (double)(sum/count) );

        /*
         *   N 423
         *   գլխավոր անկյունագծից ներքև կամ նրա վրա գտնվող զույգ արժեք ունեցող տարրերի
         *   միջին քառակուսայինը
         */
        count = 0;
        sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if(A1[i][j]%2 == 0){
                    count++;
                    sum += Math.pow(A1[i][j], 2);
                }
            }
        }
        System.out.println("N 423: " + Math.sqrt(sum/count));

        /*
         *   N 424
         *   գլխավոր անկյունագծից ներքև կամ նրա վրա գտնվող կենտ արժեք ունեցող տարրերի
         *   միջին թվաբանականը
         */
        count = 0;
        sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if(A1[i][j]%2 != 0){
                    count++;
                    sum += A1[i][j];
                }
            }
        }
        System.out.println("N 424: " + (double) sum/count);

        /*
         *   N 425
         *   գլխավոր անկյունագծից ներքև գտնվող զույգ արժեք ունեցող տարրերի քանակը
         */
        count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if(A1[i][j]%2 == 0){
                    count++;
                }
            }
        }
        System.out.println("N 425: " + count);


        /*
         *   N 426
         *   օժանդակ անկյունագծից վերև գտնվող զույգ արժեք ունեցող տարրերի գումարը
         */
        System.out.println();
        System.out.println("օժանդակ անկյունագծից վերև գտնվող տարրերը");
        sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(j < maxIndex-i){
                    System.out.print(A1[i][j]+", ");
                    if(A1[i][j]%2 ==0){
                        sum += A1[i][j];
                    }
                } else {
                    System.out.print("**, ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("N 426: " + sum);

        /*
         *   N 427
         *   օժանդակ անկյունագծից վերև կամ նրա վրա գտնվող այն տարրերի արտադրյալը,
         *   որոնք բազմապատիկ են տրված k ամբողջ թվին:
         */
        k = 50;
        int p = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(j < maxIndex-i){
                    if(A1[i][j]%k == 0){
                        p *= A1[i][j];
                    }
                }
            }
        }
        System.out.println("N 427: " + p);

        /*
         *   N 428
         *   օժանդակ անկյունագծից վերև կամ նրա վրա գտնվող զրո արժեք ունեցող տարրերի քանակը
         */
        count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(j <= maxIndex-i){
                    if(A1[i][j] == 0){
                        count++;
                    }
                }
            }
        }
        System.out.println("N 428: " + count);

        /*
         *   N 429
         *   գլխավոր անկյունագծից վերև կամ նրա վրա գտնվող զրո արժեք ունեցող այն տարրերի քանակը,
         *   որոնք 5 թվին բաժանելիս կմնա 2 մնացորդ
         */
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(i<=j) {
                    System.out.print(A1[i][j] + ", ");
                    if(A1[i][j] % 5 == 2){
                        count++;
                    }
                } else {
                    System.out.print("**, ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("N 429: " + count);

        /*
         *   N 430
         *   գլխավոր անկյունագծից ներքև կամ նրա վրա գտնվող զույգ արժեք ունեցող տարրերի
         *   միջին թվաբանականը
         */

        System.out.println();
        count = 0;
        sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(i>=j) {
                    System.out.print(A1[i][j] + ", ");
                    if(A1[i][j] % 2 == 0){
                        count++;
                        sum += A1[i][j];
                    }
                } else {
                    System.out.print("**, ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("N 430: " + (double) sum/count);
    }
}

