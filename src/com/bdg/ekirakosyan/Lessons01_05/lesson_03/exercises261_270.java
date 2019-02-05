package Lessons01_05.lesson_03;
/**
 **  Տրված են  X և Y միաչափ զանգվածները
 **  Կազմել բլոկ սխեմա և ծրագիր որոնք կհաշվեն և կտպեն
 * */
public class exercises261_270 {

    public static void main(String[] args) {
        /**
         **  N 261
         **  տրված զանգվածների տարրերի միջին թվաբանականների արտադրյալը
         **/
        int x[] = {5,7,82, 47, 1};
        int y[] = {3,75,9, 23, 16};
        int sumX = 0;
        int sumY = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            sumX += x[i];
            sumY += y[i];
            count++;
        }
        System.out.println( "N261: " + (sumX/count)*(sumY/count) );

        /**
         ** N 262
         **  տրված զանգվածների տարրերի միջին քառակուսայինների գումարը
         **/
        int x1[] = {5,7,82, 47, 1};
        int y1[] = {3,75,9, 23, 16};
        sumX = 0;
        sumY = 0;
        count = 0;
        for (int i = 0; i < x1.length; i++) {
            sumX += Math.pow(x1[i], 2);
            sumY += Math.pow(y1[i], 2);
            count++;
        }
        System.out.println( "N262: " +  ( Math.sqrt(sumX/count) + Math.sqrt(sumY/count) ) );

        /**
         ** N 263
         **  տրված զանգվածների դրական տարրերի ընդհանուր քանակը
         **/
        int x2[] = {5,-7,-82, 47, -1};
        int y2[] = {3,-75,-9, -23, -16};
        int countX1 = 0;
        int countX2 = 0;
        for (int i = 0; i < x2.length; i++) {
            if (x2[i] > 0) {
                countX1++;
            }
            if (y2[i] > 0) {
                countX2++;
            }
        }
        System.out.println( "N263: " +  (countX1+countX2) );

        /**
         ** N 264
         **  տրված զանգվածների բացասական տարրերի ընդհանուր քանակը
         **/
        countX1 = 0;
        countX2 = 0;
        for (int i = 0; i < x2.length; i++) {
            if (x2[i] < 0) {
                countX1++;
            }
            if (y2[i] < 0) {
                countX2++;
            }
        }
        System.out.println( "N264: " +  (countX1+countX2) );

        /**
         **  N265
         **  X զանգվածի տարրերի գումարի հարաբերությունը Y զանգվածնի տարրերի արտադրյալին
         **  ենթադրվում է որ Y զանգվածը չի պարունակում զրոյին հավասար տարրեր
         **/
        int x3[] = {20,2,12,18,2}; // 54
        int y3[] = {1,2,1,3,3};    //18
        int sum = 0;
        int p = 1;
        for (int i = 0; i < x3.length ; i++) {
            sum+=x3[i];
            p*=y3[i];
        }
        System.out.println( "N265: " +  (sum/p) );

        /**
         **  N266
         **  X զանգվածի կենտ արժեք ունեցող տարրերի և Y զանգվածնի զույգ արժեք ունեցող տարրերի
         **  գումարների տարբերությանը
         **/
        int x4[] = {21,9,12,4,2};
        int y4[] = {1,2,1,3,3};
        sumX = 0;
        sumY = 0;
        for (int i = 0; i < x.length; i++) {
            if (x4[i]%2 != 0) {
                sumX += x4[i];
            }
            if (y4[i]%2 == 0) {
                sumY += y4[i];
            }
        }
        System.out.println( "N266: " +  (sumX-sumY) );

        /**
         **  N267
         **  տրված զանգվածների 7-ին բազմապատիկ տարրերի
         **  ընդհանուր գումարները
         **/
        int x5[] = {9,9,12,7,2};
        int y5[] = {1,8,1,5,21};
        sum=0;
        for (int i = 0; i < x5.length ; i++) {
            if (x5[i]%7==0) {
                sum += x5[i];
            }
            if (y5[i]%7==0) {
                sum += y5[i];
            }
        }
        System.out.println( "N267: " +  sum);

        /**
         **  N268
         **  տրված զանգվածների տրված k-ին բազմապատիկ տարրերի
         **  ընդհանուր քանակը
         **/
        int k = 6;
        int x6[] = {21,9,12,7,2};
        int y6[] = {1,18,1,6,7};
        count = 0;
        for (int i = 0; i < x6.length ; i++) {
            if (x6[i]%k==0) {
                count++;
            }
            if (y6[i]%k==0) {
                count++;
            }
        }
        System.out.println( "N268: " +  count);

        /**
         **  N269
         **  X զանգվածի զույգ ինդեքս ունեցող և Y զանգվածնի կենտ ինդեքս ունեցող տարրերի
         **  ընդհանուր գումարը
         **/
        int x7[] = {3,9,1,7,2};
        int y7[] = {1,18,1,6,7};
        sumX = 0;
        sumY = 0;
        for (int i = 1; i < x7.length ; i++) {
            if (i%2==0) {
                sumX += x7[i];
            } else {
                sumY += y7[i];
            }
        }
        System.out.println( "N269: " +  (sumX+sumY) );


        /**
         **  N270
         **  տրված զանգվածների տարրերի քառակուսիների
         **  ընդհանուր գումարը
         **/
        int x8[] = {3,9,1,7,2};
        int y8[] = {1,18,1,6,7};
        sumX = 0;
        sumY = 0;
        for (int i = 0; i < x8.length ; i++) {
            sumX += Math.pow(x8[i], 2);
            sumY += Math.pow(y8[i], 2);
        }
        System.out.println( "N270: " +  (sumX+sumY) );
    }

}
