package com.bdg.ekirakosyan.Lessons01_05.lesson_04;

import java.util.Arrays;

/**
 **  Տրված են  n բնական թիվը և n հատ սիմվոլային տիպի տարրեր պարունակող միաչափ զանգված
 **  Կազմել բլոկ սխեմա և ծրագիր որոնք կհաշվեն և կտպեն
 * */
public class exercises271_280 {
    public static void main(String[] args) {
        /**
         ** N 271
         **  այն տարրերի քանակը որոնց աարժեքը հավասար է 'a'-ին
         **/
        char[] a = {'a', 's', 'a', 'a', 'h', 'a', 'a'};
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]=='a'){
                count++;
            }
        }
        System.out.println("N 271: "+count);

        /**
         **  N 272
         **  տրամաբանական t փոփոխականին կվերագրեն true, եթե զանգվածում կան n/2 հատ 'b' արժեք ունեցող տարրեր
         **  հակառակ դեպքում false
         **  տպել t-ն
         **/
        boolean t = false;
        char[] a1 = {'a','b','c','b', 'b'};
        count=0;
        for(int i = 0; i < a1.length; i++){
            if (a1[i] == 'b'){
                count++;
            }
        }
        if (count >= a1.length/2){
            t = true;
        }
        System.out.println("N 272: " + t);

        /**
         **  N 273
         **  կհաշվեն և կտպեն տարրերի ինդեքսների գումարը,
         **  որոնց արժեքը հավասար է 's'-ից
         **/
        char[] a3 = {'s', 's', 'k', 'k', 'l', 's'};
        int sum = 0;
        for (int i = 0; i < a3.length; i++){
            if (a3[i] == 's'){
                sum += i;
            }
        }
        System.out.println("N 273: " + sum);

        /**
         **  N 274
         **  կհաշվեն և կտպեն տարրերի ինդեքսների միջին թվամաբանականը,
         **  որոնց արժեքը մեծ է 'h'-ից
         **/
        char[] a4 = {'h', 'h', 'k', 'h', 'l', 'h', 'm','s','l','i','j'};
        sum = 0;
        count = 0;
        for (int i= 0; i < a4.length; i++){
            if (a4[i] > 'h'){
                sum += i;
                count++;
            }
        }
        System.out.println("N 274: " + (double) sum/count);

        /**
         **  N 275
         **  կհաշվեն և կտպեն տարրերի տարրերի քանակաը,
         **  որոնց արժեքը փոքր է 'k'-ից
         **/
        char[] a5 = {'a', 'z', 'h', 'h', 'k', 'h', 'l', 'h', 'm'};
        count = 0;
        for (int i = 0; i < a5.length; i++){
            if(a5[i] < 'k'){
                count++;
            }
        }
        System.out.println("N 275: " + count);

        /**
         **  N 276
         **  տրամաբանական t փոփոխականին կվերագրեն true եթե զանգվածում տարրերերից մեկի արժեքը հավասար է 'r'
         **  հակառակ դեպքում false:
         **  տպել t-ն
         **/
        char[] a6 = {'e', 'r', 'y', 'r', 'k'};
        boolean t1 = false;
        for (int i = 0; i < a6.length; i++){
            if(a6[i] == 'r') {
                t1 = true;
                break;
            }
        }
        System.out.println("N 276: " + t1);

        /**
         **  N 277
         **  կստանան նոր զանգված, որի տարրերը ստացվում են տրված զանգվածից
         **  հեռացնելով 'd' արժեք ունեցող տարրերը
         **/
        char a7[]={'f','d','g','i','d','k','h','d'};
        int newLenght = 0;
        for (int i = 0; i < a7.length; i++){
            if(a7[i] != 'd'){
                newLenght++;
            }
        }
        char a8[] = new char[newLenght];
        int j = 0;
        for (int i = 0; i < a7.length; i++){
            if(a7[i] != 'd'){
                a8[j] = a7[i];
                j++;
            }
        }
        System.out.println("N 277: " + Arrays.toString(a8));

        /**
         **  N 278
         **  կստանան նոր զանգված, որի տարրերը ստացվում են տրված զանգվածից
         **  կենտ ինդեքս ունեցող տարրերից
         **/
        char a9[]={'f','d','g','i','d','d'};
        count = 0;
        for (int i = 0; i < a9.length; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        char a10[] = new char[count];
        j = 0;
        for (int i = 0; i < a9.length; i++){
            if(i % 2 != 0){
                a10[j] = a9[i];
                j++;
            }
        }
        System.out.println("N 278: " + Arrays.toString(a10));

        /**
         **  N 279
         **  կստանան նոր զանգված, որի տարրերը ստացվում են տրված զանգվածի այն տարրերից,
         **  որոնց արժեք մեծ է 'k'-ից
         **/
        char array1[]={'f','d','g','w','x','z', 'l', 'm','o'};
        count = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > 'k'){
                count++;
            }
        }
        char array2[] = new char[count];
        j = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > 'k'){
                array2[j] = array1[i];
                j++;
            }
        }
        System.out.println("N 279: " + Arrays.toString(array2));

        /**
         **  N 280
         **  կստանան նոր զանգված, որի տարրերը ստացվում են տրված զանգվածից
         **  նրա մեջ ամեն մի 'f' արժեք ունեցող տարրերից հետո ավելացնելով ևս մեկ  'f'
         **/
        char array3[]={'f','f','g','f','d','k','h','d'};
        count = 0;
        for (int i = 0; i < array3.length; i++){
            if (array3[i]=='f'){
                count++;
            }
        }
        char array4[] = new char[array3.length+count];
        j = 0;
        for (int i = 0; i < array3.length; i++){
            array4[j]  = array3[i];
            if (array3[i]=='f'){
                array4[j+1] = 'f';
                j++;
            }
            j++;
        }
        System.out.println("N 280: " + Arrays.toString(array4));
    }
}
