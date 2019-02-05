package Lessons01_05.lesson_04;

import java.util.Arrays;

/**
 **  Տրված են  n բնական թիվը և n տարրեր պարունակող X միաչափ զանգվածը:
 **  Կազմել այնպիսի նոր Y վեկտորի ստացման և տպման բլոկ սխեման ու ծրագիրը,
 *   որի տարրեը ստացվում են
 * */
public class exercises311_316 {
    public static void main(String[] args) {
        /*
         *   N 311
         *   վեկտորի դրական տարրերից, նրանց արժեքը մեծացնելով
         *   այդ նույն վեկտորի մեծագույն տարրի արժեքի չափով
         */
        int X1[] = {8, 3, 7, 2, -5, -4};
        int lenghtY = 0;
        int maxX1 = X1[0];
        for (int i = 0; i < X1.length; i++) {
            if (X1[i] > 0) {
                lenghtY++;
            }
            if (X1[i] > maxX1) {
                maxX1 = X1[i];
            }
        }
        int Y1[] = new int[lenghtY];
        int j = 0;
        for (int i = 0; i < X1.length; i++) {
            if (X1[i] > 0) {
                Y1[j] = X1[i] + maxX1;
                j++;
            }
        }
        System.out.println("N 311: " + Arrays.toString(Y1));

        /*
         *   N 312
         *   վեկտորի ամեն մի երկյակից, սկսած առաջին տարրից,
         *   վերցնելով մոդուլով մեծ արժեք ունեցող տարրը
         */
        int X2[] = {8, 3, 7, 2, -5, -4, 6, 7};
        int Y2[] = new int[X2.length / 2]; //=> 8,7,-5,7
        j = 0;
        for (int i = 0; i < X2.length - 1; i = i + 2) {
            if (Math.abs(X2[i]) > Math.abs(X2[i + 1])) {
                Y2[j] = X2[i];
            } else {
                Y2[j] = X2[i + 1];
            }
            j++;
        }
        System.out.println("N 312: " + Arrays.toString(Y2));

        /*
         *   N 313
         *   վեկտորից, նրա մեջ տեղերով փոխելով յուրաքանչյուր զույգ ինդեքս ունեցող տարրի
         *   և նրան նախորդող կենտ ինդեքս ունեցող տարրի արժեքները
         */
        int X3[] = {8, 3, 7, 2, -5, -4, 6, 7};
        int Y3[] = new int[X3.length];
        Y3[0] = X3[0];
        for (int i = 2; i < X3.length; i += 2) {
            Y3[i - 1] = X3[i];
            Y3[i] = X3[i - 1];
        }
        if (X3.length % 2 == 0) {
            Y3[X3.length - 1] = X3[X3.length - 1];
        }
        System.out.println("N 313: " + Arrays.toString(Y3));


        /*
         *   N 314
         *   վեկտորի ամեն մի դրական տարրից հետո ավելացնելով Օ արժեք ունեցող տարր
         */
        int X4[] = {8, -3, -7, 2, -5, -4, 6, 7};
        lenghtY = 0;
        for (int i = 0; i < X4.length; i++) {
            if (X4[i] > 0) {
                lenghtY++;
            }
        }
        lenghtY = lenghtY + X4.length;
        int Y4[] = new int[lenghtY];
        j = 0;
        for (int i = 0; i < X4.length; i++) {
            Y4[j] = X4[i];
            if (X4[i] > 0) {
                Y4[j + 1] = 0;
                j++;
            }
            j++;
        }
        System.out.println("N 314: " + Arrays.toString(Y4));


        /*
         *   N 315
         *   վեկտորի դրական տարրից, երե տրված վեկտորում կա տրված b թվից փոքր գոնե մեկ տարր,
         *   հակառակ դեպքում բացասական տարրերից:
         */
        int X5[] = {8, -3, -7, 2, -5, -4, -6, 7};
        int lenghtPositives = 0;
        int lenghtNegatives = 0;
        for (int i = 0; i < X5.length; i++) {
            if (X5[i] > 0) {
                lenghtPositives++;
            } else {
                lenghtNegatives++;
            }
        }

        int b = -110;
        boolean t = false;
        for (int i = 0; i < X5.length; i++) {
            if (X5[i] < b) {
                t = true;
                break;
            }
        }
        j = 0;
        if (t) {
            int Y5[] = new int[lenghtPositives];
            for (int i = 0; i < X5.length; i++) {
                if (X5[i] > 0) {
                    Y5[j] = X5[i];
                    j++;
                }
            }
            System.out.println("N 315: " + Arrays.toString(Y5));
        } else {
            int Y5[] = new int[lenghtNegatives];
            for (int i = 0; i < X5.length; i++) {
                if (X5[i] < 0) {
                    Y5[j] = X5[i];
                    j++;
                }
            }
            System.out.println("N 315: " + Arrays.toString(Y5));
        }

        /*
         *   N 316
         *   վեկտորի այն տարրերից որոնք բացարձակ արժեքով փոքր են
         *   վեկտորի max և min տարրերի միջին թվաբանականից
         */
        int X6[] = {22, 38, -5, -4, -6, 17, 1};
        int maxX6 = X6[0];
        int minX6 = X6[0];
        for (int i = 0; i < X6.length; i++) {
            if (X6[i] > maxX6) {
                maxX6 = X6[i];
            }
            if (X6[i] < minX6) {
                minX6 = X6[i];
            }
        }
        int mTvabanakan = (int) (maxX6 + minX6) / 2;
        lenghtY = 0;
        for (int i = 0; i < X6.length; i++) {
            if (Math.abs(X6[i]) < mTvabanakan){
                lenghtY++;
            }
        }

        int Y6[] = new int[lenghtY];
        j=0;
        for (int i = 0; i < X6.length; i++) {
            if (Math.abs(X6[i]) < mTvabanakan){
                Y6[j] = X6[i];
                j++;
            }
        }
        System.out.println("N 316: " + Arrays.toString(Y6));
    }
}
