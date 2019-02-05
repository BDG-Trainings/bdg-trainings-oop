package Lessons01_05.lesson_03;

/**
 **  Կազմել բլոկ սխեմա և ծրագիր որոնք կհաշվեն և կտպեն
 **  n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
 **/
public class exercises231_250 {
    public static void main(String[] args) {
        /**
         **  N 231
         **  զույգ արժեք ունեցող տարրերի քառակուսիների գումարը
         **/
        int a[] = {3,4,7,9,1,2};
        int sum = 0;
        int count = 0;
        int p = 1;
        int sum1 = 0;
        for (int i = 0; i < a.length ; i++) {
            if (a[i]%2 == 0){
                sum += Math.pow(a[i], 2);
                count++;
                p *= a[i];
                sum1 += a[i];
            }
        }
        System.out.println("N231: " + sum);

        /**
         **  N 232
         **  զույգ արժեք ունեցող տարրերի քանակը
         **/
        System.out.println("N232: " + count);


        /**
         **  N 233
         **  զույգ արժեք ունեցող տարրերի արտադրյալը և գումարը
         **/
        System.out.println("N233: Sum=" + sum1 + " & P=" + p);


        /**
         **  N 234
         **  կենտ արժեք ունեցող տարրերի միջին թվաբանականը
         **/
        int a1[] = {3,4,7,9,1,2};
        sum = 0;
        count = 0;
        sum1 = 0;
        p = 1;
        for (int i = 0; i < a1.length ; i++) {
            if (a1[i]%2 != 0){
                count++;
                sum += a1[i];
                //234
                sum1 += Math.pow(a1[i],2);
                //235
                p *= a[i];
            }
        }
        System.out.println("N234: " + sum/count);

        /**
         **  N 235
         **  կենտ արժեք ունեցող տարրերի միջին քառակուսայինը
         **/
        System.out.println("N234: " + Math.sqrt(sum1/count));

        /**
         **  N 236
         **  կենտ արժեք ունեցող տարրերի քանակը և արտադրյալը
         **/
        System.out.println("N235: Count=" + count + " & P=" + p);

        /**
         **  N 237
         **  զրո արժեք ունեցող տարրերի քանակը
         **/
        int a2[] = {0,4,0,0,9,1,0};
        count = 0;
        for (int i = 0; i < a2.length ; i++) {
            if (a2[i] == 0){
                count++;
            }
        }
        System.out.println("N236: " + count);

        /**
         **  N 238
         **  3-ին բազմապատիկ տարրերի միջին թվաբանականը
         **/
        int a3[] = {3,4,7,9,1,2};
        sum = 0;
        count = 0;
        for (int i = 0; i < a3.length ; i++) {
            if (a3[i]%3 == 0){
                count++;
                sum += a3[i];
            }
        }
        System.out.println("N238: " + sum/count);

        /**
         **  N 239
         **  5-ին բազմապատիկ տարրերի միջին քառակուսայինը
         **/
        int a4[] = {3,4,5,9,10,2};
        count = 0;
        sum1 = 0;
        for (int i = 0; i < a4.length ; i++) {
            if (a4[i]%5 != 0){
                count++;
                sum1 += Math.pow(a4[i],2);
            }
        }
        System.out.println("N239: " + Math.sqrt(sum1/count));


        /**
         **  N 240
         **  7-ին բազմապատիկ տարրերի քանակը
         **/
        int a5[] = {3,4,35,9,10,2,21,7};
        count = 0;
        for (int i = 0; i < a5.length ; i++) {
            if (a5[i]%7 == 0) {
                count++;
            }
        }
        System.out.println("N240: " + count);

        /**
         **  N 241
         **  տրված k-ին թվին բազմապատիկ տարրերի գումարը
         **/
        int k = 5;
        int a6[] = {3,4,35,9,10,2,21,7};
        sum = 0;
        for (int i = 0; i < a6.length ; i++) {
            if (a6[i]%k == 0){
                sum += a6[i];
            }
        }
        System.out.println("N241: " + sum);

        /**
         **  N 242
         **  տրված m-ին թվին բազմապատիկ տարրերի արտադրյալը
         **/
        int m = 3;
        int a7[] = {3,9,8,5,1};
        p = 1;
        for (int i = 0; i < a7.length ; i++) {
            if (a7[i]%m == 0) {
                p*=a7[i];
            }
        }
        System.out.println("N242: " + p);

        /**
         **  N 243
         **  տրված t-ին թվին բազմապատիկ տարրերի քանակը
         **/
        int t=2;
        int a8[] = {5,4,8,9,45,82};
        count = 0;
        for (int i = 0; i < a8.length; i++) {
            if (a8[i]%t == 0) {
                count++;
            }
        }
        System.out.println("N243: " + count);

        /**
         **  N 244
         **  այն տարրերի արտադրյալը որոնք 5-ի բաժանելուց կմնա 2 մնացորդ
         **/
        int a9[] = {12,4,8,22,45};
        p = 1;
        for (int i = 0; i < a9.length; i++) {
            if (a9[i]%5==2){
                p *= a9[i];
            }
        }
        System.out.println("N244; " + p);

        /**
         **  N 245
         **  այն տարրերի քառակուսիների գումարը
         ** որոնց արժեքների և ինդեքսների գումարը առանց մնացորդի բաժանվում է 3-ի
         **/
        int a10[] = {6,8,8,22,45};
        sum = 0;
        for (int i = 0; i < a10.length; i++) {
            if ( (a10[i]+i)%3 == 0){
                sum += Math.pow(a10[i], 2);
            }
        }
        System.out.println("N245: " + sum);

        /**
         **  N 246
         **  այն տարրերի միջին թվաբանականը
         **  որոնց ինդեքսը որևէ բնական թվի քառակուսի է
         **/
        int a11[] = {6,8,8,22,45};
        count = 0;
        sum = 0;
        double root = 0;
        for (int i = 1; i < a11.length; i++) {
            root = Math.sqrt(i);
            if( root%1 == 0 ){
                count++;
                sum += a11[i];
            }
        }
        System.out.println("N246: " + (double) sum/count);


        /**
         **  N 247
         **  այն տարրերի միջին քառակուսայինը
         **  որոնց արժեքը մեծ ինդեքսի արժեքից
         **/
        int a12[] = {0,0,3,5,7};
        count = 0;
        sum1 = 0;
        for (int i = 0; i < a12.length ; i++) {
            if (a12[i] > i) {
                count++;
                sum1 += Math.pow(a12[i],2);
            }
        }
        System.out.println("N247: " + Math.sqrt(sum1/count));

        /**
         **  N 248
         **  այն տարրերի գումարը
         **  որոնց արժեքի և ինդեքսի գումարի քառակուսին առանց մնացորդի բաժանվում է տրված k ամբողջ թվին
         **/
        int[] array = {6,11,8,22,45};
        k = 6;
        sum = 0;
        for (int i = 0; i < array.length ; i++) {
            if( Math.pow((array[i]+i), 2) % k == 0){
                sum += array[i];
            }
        }
        System.out.println("N248: " + sum);

        /**
         **  N 249
         **  այն տարրերի քանակը
         **  որոնց արժեքի և ինդեքսի տարբերությունը բացարձակ արժեքով մեծ է տրված k թվից
         **/
        int[] array1 = {6,11,8,22,45};
        k = 6;
        count = 0;
        for (int i = 0; i < array1.length ; i++) {
            if( Math.abs((array1[i]-i)) > k){
                count++;
            }
        }
        System.out.println("N249: " + count);

        /**
         **  N 250
         **  այն տարրերի քառակուսիների արտադրյալը
         **  որոնց արժեքների և ինդեքսների արտադրյալը 3-ի բաժանելիս կմնա 2 մնացորդ
         **/
        int[] array2 = {1,8,11,8,22,45};
        p = 1;
        for (int i = 0; i < array2.length ; i++) {
            if((array2[i]*i)%3 == 2){
                p *= Math.pow(array2[i], 2);
            }
        }
        System.out.println("N250: " + p);
    }
}
