package Lessons01_05;

public class Lesson_01 {
    public static void main(String[] args) {
        /* Տրված են a եվ b թվերը */
        int a = 5;
        int b = 7;

        /*
         * 1 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը,
         * եթե a հավասար է b-ին հակառակ դեպքում false: Արտածել t-ի արժեքը:
         */
        boolean t = (a==b) ? true : false;
        System.out.println("N1: "+t);

        /*
         * 2 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը,
         * եթե a մեծ է b-ից հակառակ դեպքում false: Արտածել t-ի արժեքը:
         */
        boolean t1 = (a>b) ? true : false;
        System.out.println("N2: "+t1);

        /*
        *  3 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը,
        *  եթե a փոքր է  b-ից հակառակ դեպքում false: Արտածել t-ի արժեքը:
        */
        boolean t2 = (a<b)? true : false;
        System.out.println("N3: "+t2);

        /*
        Տրված են x, y եվ z թվերը
        4 - Կազմել ծրագիր, որը կարտածի մեծագույնի արժեքը:
        5 - Կազմել ծրագիր, որը կարտածի փոքրագույնի արժեքը:
        */
        int x = 9;
        int y = 7;
        int z = 0;

        //ex. 4
        int max = x;
        if( y > x && y > z ){
            max = y;
        } else if ( z > x && z > y ){
            max = z;
        }
        System.out.println("N4: " + max);

        //ex. 5
        int min = x;
        if( y < x && y < z ){
            min = y;
        } else if ( z < x && z < y ){
            min = z;
        }
        System.out.println("N5: " + min);

        /*
        Տրված են a1 եվ b1 թվերը
        6 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը,
            եթե նրանց գումարը մեծ է տրված k թվից: Արտածել t-ի արժեքը:
        7 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը,
            եթե նրանց գումարը փոքր է տրված k թվից: Արտածել t-ի արժեքը:
        */
        int a1 = 10;
        int b1 = 25;
        int k = 70;
        //ex. 6
        boolean t4 = ( (a1 + b1) > k ) ? true : false;
        System.out.println("N6. " + t4);
        //ex. 7
        boolean t5 = ( (a1 + b1) < k ) ? true : false;
        System.out.println("N7. " + t5);

        /*
        Տրված են a2, b2 եվ c2 թվերը

        8  - Արտածել թվերը ըստ աճման կարգի:
        9  - Արտածել թվերը ըստ նվազման կարգով:
        10 - Արտածել փոքրագույնի արժեքը եթե մեծագույնը փոքր է տրված k թվից:
        */
        int a2 = 8;
        int b2 = 78;
        int c2 = 3;

        int tmp = a2 ;
        if (a2 > b2) { tmp = a2; a2 = b2; b2 = tmp; }
        if (a2 > c2) { tmp = a2; a2 = c2; c2 = tmp; }
        if (b2 > c2) { tmp = b2; b2 = c2; c2 = tmp; }

        //ex. 8
        System.out.println("N8: " + a2 + " " + b2 + " " + c2);

        //ex. 9
        System.out.println("N9: " + c2 + " " + b2 + " " + a2);

        //ex. 10
        //get max
        int maxNum = a1;
        maxNum = (maxNum > b2) ? maxNum : b2;
        maxNum = (maxNum > c2) ? maxNum : c2;
        System.out.print("N10: maxNum => " + maxNum+"; ");
        //get min
        int minNum = 0;
        while ( a2 != 0 && b2 != 0 && c2 != 0 ) {
            a2--; b2--; c2--; minNum++;
        }
        System.out.println("minNum => "+minNum + "; ");

        int k1 = 68;
        if(maxNum > k1){
            System.out.println("max>k1 so min = "+minNum);
        }
    }
}
