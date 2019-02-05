package Lessons01_05.lesson_03;
/*
 * Kazmel blok  sxema ev cragir voronq khashven
 * trvac tarer parunakox miachap zangvaci
 * */
public class exercises211_230 {
    public static void main(String[] args) {
        /*
         * N 211
         *  drakan tarreri michin tvabanakan@
         */
        int array[] = {1,-5, -6, 7, -9, 0, 8};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > 0 ){
                sum += array[i];
                count++;
            }
        }
        System.out.println("N 211: " + (double) sum/count);


        /*
         * N 212
         *  drakan tarreri michin qarakusajin@
         */
        int array1[] = {1,-5, -6, 7, -9, 0};
        sum = 0;
        count = 0;
        for (int i = 0; i < array1.length; i++) {
            if ( array1[i] > 0 ){
                sum += Math.pow(array1[i], 2);
                count++;
            }
        }

        System.out.println("N 212: " + Math.sqrt(sum/count));

        /*
         * N 214
         *  bacasakan tarreri michin qarakusajin@
         */
        int array2[] = {1,-5, -6, 7, -8, 0};
        sum = 0;
        count = 0;
        for (int i = 0; i < array2.length; i++) {
            if ( array2[i] < 0 ){
                sum += Math.pow(array2[i], 2);
                count++;
            }
        }
        System.out.println("N 213: " + Math.sqrt(sum/count));

        /*
         * N 214
         *  bacasakan tarreri michin tvabanakan@
         */
        int array3[] = {1,-5, -6, 7, -8, 0};
        sum = 0;
        count = 0;
        for (int i = 0; i < array3.length; i++) {
            if ( array3[i] < 0 ){
                sum += array3[i];
                count++;
            }
        }
        System.out.println("N 214: " + (double) sum/count);

        /*
         * N 215
         *  zujg index unecox tarreri gumar@
         */
        int array4[] = {5, 2, 3, 7, 1, 0};
        sum = 0;
        for (int i = 0; i < array4.length; i++) {
            if ( i%2 == 0 ){
                sum += array4[i];
            }
        }
        System.out.println("N 215: " + sum);

        /*
         * N 216
         *  zujg index unecox tarreri artadrjal@
         */
        int array5[] = {5, 2, 3, 7, 1, 0};
        int p = 1;
        for (int i = 0; i < array5.length; i++) {
            if ( i%2 == 0 ){
                p *= array5[i];
            }
        }
        System.out.println("N 216: " + p);

        /*
         * N 217
         *  kent index unecox tarreri qarakusineri artadrjal@
         */
        int array6[] = {5, -2, 3, 1, 1, 2};
        p = 1;
        for (int i = 0; i < array6.length; i++) {
            if ( i%2 != 0 ){
                p *= Math.pow(array6[i],2);
            }
        }
        System.out.println("N 217: " + p);

        /*
         * N 218
         *  kent index unecox tarreri bacardzak arjeqneri gumar@
         */
        int array7[] = {5, -2, -1, 1, 2, -5};
        sum = 0;
        for (int i = 0; i < array7.length; i++) {
            if ( i%2 != 0 ){
                sum += Math.abs(array7[i]);
            }
        }
        System.out.println("N 218: " + sum);

        /*
         * N 219
         *  K tvin bazmapatik index unecox tarreri qanak@
         */
        int array8[] = {5, -2, -1, 1, 2, -5};
        int k = 2;
        count = 0;
        for (int i = 0; i < array8.length; i++) {
            if ( i%k == 0 ){
                count++;
            }
        }
        System.out.println("N 219: " + count);

        /*
         * N 220
         *  drakan ev bacasakan tarreri qanak@
         */
        int array9[] = {5, -2, -1, 1, 2, -5, 5, 9};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < array9.length; i++) {
            if ( array9[i] >= 0 ){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("N 220: Even Count=" + even + " ---> Odd Count=" + odd);

        /*
         * N 221
         *  trvac [a,b] michakajqin patkanox tarreri gumar@
         */
        int array10[] = {5, -2, -1, 1, 2, -5, 5, 7};
        int a = 3;
        int b = 7;
        sum = 0;
        for (int i = 0; i < array10.length; i++) {
            if ( array10[i] >= a && array10[i] <= b ){
                sum += array10[i];
            }
        }
        System.out.println("N 221: Sum=" + sum);

        /*
         * N 222
         *  trvac  [c,d) migakajqin patkanox tarreri artadrjal@
         */
        int array11[] = {3, -2, -1, 5, 2, 1, 3};
        int c = 3;
        int d = 5;
        p = 1;
        for (int i = 0; i < array11.length; i++) {
            if ( array11[i] >= c && array11[i] < d ){
                p *= array11[i];
            }
        }
        System.out.println("N 222: P=" + p);

        /*
         * N 223
         *  trvac  (a,b) migakajqin patkanox tarreri qanak@
         */
        int array12[] = {4, 5, 2, 1, 3, 7, 6, 5};
        a = 3;
        b = 8;
        count = 0;
        for (int i = 0; i < array12.length; i++) {
            if ( array12[i] > a && array12[i] < b ){
                count++;
            }
        }
        System.out.println("N 223: Count=" + count);

        /*
         * N 224
         *  ajn tarreri xorhanardneri gumar@, vornq bacardzak arjeqov < k trvac tvic
         */
        int array13[] = {15, 2, 2, 1};
        k = 12;
        sum = 0;
        p = 1;
        count = 0;
        for (int i = 0; i < array13.length; i++) {
            if ( Math.abs(array13[i]) < k ){
                sum += Math.pow(array13[i], 3);
                p *=array13[i];
                count++;
            }
        }
        System.out.println("N 224: Sum=" + sum);

        /*
         * N 225
         *  ajn tarreri artadrjal@ voronq bacardzak arjeqov poqr en trvac tvic
         */
        System.out.println("N 225: P=" + p);

        /*
         * N 226
         *  ajn tarreri qanak@ voronq bacardzak arjeqov poqr en trvac tvic
         */
        System.out.println("N 226: Count=" + count);


        /*
         * N 227
         *  ajn tarreri mijin tvabanakan@
         *  voronc index@ bazmapatik e trvac k tvin
         */
        int array15[] = {15, 2, 2, 1, 11, 8};
        k = 5;
        sum = 0;
        count = 0;
        for (int i = 1; i < array15.length; i++) {
            if ( i%k == 0 ){
                sum += array15[i];
                count++;
            }
        }
        System.out.println("N 227: S=" + sum/count);


        /*
         * N 228
         *  ajn tarreri gumar@
         *  voronc index@ aranc mnacordi bajanvum e trvac k tvin
         */
        int array16[] = {15, 2, 20, 1, 11, 15, 3, 1, 1, 1, 5, 11};
        k = 5;
        sum = 0;
        for (int i = 1; i < array16.length; i++) {
            if ( i%k == 0 ){
                sum += array16[i];
            }
        }
        System.out.println("N 228: Sum=" + sum);

        /*
         * N 229
         *  ajn tarreri artadrjal@
         *  voronc arjeqi ev index-i tarberutjun@ drakan tiv e
         */
        int array17[] = {15, 0, 1, 1, 1, 0, 7};
        p = 1;
        for (int i = 0; i < array17.length; i++) {
            if ( array17[i]-i > 0 ){
                p *= array17[i];
            }
        }
        System.out.println("N 229: Sum=" + p);

        /*
         * N 230
         *  ajn tarreri michin qarakusajin@
         *  voronc ambwxj mas@ bazmapatik e trvac k -in
         */
        double array18[] = {10.05, 5.3, 1, 7, -9, 0};
        k = 5;
        sum = 0;
        count = 0;
        for (int i = 0; i < array18.length; i++) {
            if ( (int) array18[i] % k == 0 ){
                sum += Math.pow(array18[i], 2);
                count++;
            }
        }
        System.out.println("N 230: " +  Math.sqrt(sum/count));
    }
}
