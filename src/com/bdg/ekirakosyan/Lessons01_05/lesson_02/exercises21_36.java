package Lessons01_05.lesson_02;

public class exercises21_36 {

    /*
     * Trvac en iraric tarber a, b, c tver.
     * Kazmel blok sxema ev cragir, voronq
     * */
    public static void main(String[] args) {

        int a = 5;
        int b = 22;
        int c = 36;

        /*
         *  N 21
         *  kartacen trvac tveric meci arjeq@
         **/
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("N21: Max = " + max);

        /*
         *  N 22
         *  kartacen trvac tveric poqri arjeq@
         **/
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("N22: Min = " + min);

        /*
         *  N 23
         *  ete trvac tveric gone mek@ hvasar e 1
         *  print 'true' hakarak depqum 'false'
         **/
        boolean bool = false;
        c = 1;
        if (a == 1 || b == 1 || c == 1) {
            bool = true;
        }
        System.out.println("N23: " + bool);

        /*
         *  N 24
         *  ete trvac tveric chisht erkus@ = havasar en 2-si
         *  print 'true' hakarak depqum 'false'
         **/
        a = 2;
        b = 5;
        c = 6;
        boolean bool2 = false;
        if ((a == 2 && b == 2) || (a == 2 && c == 2) || (b == 2 && c == 2)) {
            bool2 = true;
        }
        System.out.println("N24: " + bool2);

        /*
         *  N 25
         *  ete ajdpisi erkarutjun unecox hatvacnerov kareli e karucel erankjuni,
         *  print 'y=1' hakarak depqum 'y=2'
         **/
        a = 5;
        b = 7;
        c = 20;
        int y = 2;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            y = 1;
        }
        System.out.println("N25: y = " + y);

        /*
         *  N 26
         *  ete trvac tveric gone mek@ zujg e,
         *  print '1' hakarak depqum '2'
         **/
        a = 3;
        b = 5;
        c = 7;
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println("N26: 1");
        } else {
            System.out.println("N26: 2");
        }

        /*
         *  N 27
         *  ete trvac tver@ tvabanakan progresia en kazmum,
         *  print 'true' hakarak depqum 'false'
         *  http://www.hitbullseye.com/acad/quant/images/AP-GP-QR-signature.png
         **/
        a = 5;
        b = 7;
        c = 8;
        if (b - a == c - b) {
            System.out.println("N27: true");
        } else {
            System.out.println("N27: false");
        }

        /*
         *  N 28
         *  ete trvac tver@ erkrachapakan progresia en kazmum,
         *  print 'true' hakarak depqum 'false'
         *  http://www.hitbullseye.com/acad/quant/images/AP-GP-QR-signature.png
         **/
        a = 2;
        b = 6;
        c = 18;
        if (b / a == c / b) {
            System.out.println("N28: true");
        } else {
            System.out.println("N28: false");
        }

        /*
         *  N 29
         *  trvac tver@ kartacen @st achman kargi
         **/
        a = 15;
        b = 3;
        c = 5;
        int minTmp = a;
        int maxTmp = a;
        int midTmp = a;
        //max number
        if (b > maxTmp) {
            maxTmp = b;
        }
        if (c > maxTmp) {
            maxTmp = c;
        }
        //min number
        if (b < minTmp) {
            minTmp = b;
        }
        if (c < minTmp) {
            minTmp = c;
        }
        //middle number
        if (midTmp != b) {
            midTmp = b;
        }
        if (midTmp != c) {
            midTmp = c;
        }
        System.out.println("N29: " + minTmp + " " + midTmp + " " + maxTmp);

        /*
         *  N 30
         *  trvac tver@ kartacen @st nvazman kargi
         **/
        System.out.println("N30: " + maxTmp + " " + midTmp + " " + minTmp);


        /*
         * Trvac en iraric tarber a1, b1, c1, d1 tver.
         * Kazmel blok sxema ev cragir, voronq
         * */
        int a1 = 6;
        int b1 = 85;
        int c1 = 48;
        int d1 = 1;

        /*
         *  N 31 kartacen tvac tveric mecagujni arjeq@
         *  N 32 kartacen tvac tveric poqragujni arjeq@
         */
        int maxNum = a1;
        int minNum = a1;

        if (b1 > maxNum) {
            maxNum = b1;
        } else {
            minNum = b1;
        }
        if (c1 > maxNum) {
            maxNum = c1;
        } else {
            minNum = c1;
        }
        if (d1 > maxNum) {
            maxNum = d1;
        } else {
            minNum = d1;
        }

        System.out.println("N31: Max Number is " + maxNum);
        System.out.println("N31: Min Number is " + minNum);

        /*
         *  N 33
         *  kartacen true ete tvac tveric gone mek@ = 1 hakarak depqum false
         **/
        if(a1==1 || b1==1 || c1==1 || d1==1){
            System.out.println("N33: True");
        } else {
            System.out.println("N33: False");
        }

        /*
         *  N 34
         *  ete tvac tveric erkusi gumar@ = mjus erkusi gumarin print True else False
         **/
        if( (a1 + b1 == c1 + d1) || (a1 + c1 == b1 + d1) || (a1 + d1 == c1 + d1) ){
            System.out.println("N34: True");
        } else {
            System.out.println("N34: False");
        }

        /*
         *  N 35
         *  ete tvac tveric mek@ = e mjus 3-i gumarin print True else False
         **/
        if( (a1 == (b1 + c1+ d1)) || (b1 == (a1 + c1 + d1)) || (c1 == (a1 + b1 + d1)) ){
            System.out.println("N35: True");
        } else {
            System.out.println("N35: False");
        }

        /*
         *  N 36
         *  ete tvac gone 2s@ kent en print 1 else prin 2
         **/
        int count = 0;
        if( a1 % 2 > 0){
            count++;
        }
        if(b1 % 2 > 0){
            count++;
        }
        if(c1 % 2 > 0){
            count++;
        }
        if(d1 % 2 > 0){
            count++;
        }
        if(count>=2){
            System.out.println("N 36: 1");
        } else {
            System.out.println("N 36: 2");
        }
    }

}
