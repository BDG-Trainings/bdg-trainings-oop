package Lessons01_05.lesson_03;

/*
 * Kazmel blok  sxema ev cragir voronq khashven
 * trvac tarer parunakox miachap zangvaci
 * */
public class exercises251_260 {
    public static void main(String[] args) {
        /*
         * N 251
         *  mecagujn tarr@
         */
        int[]array={-8,4,-2,8,4,2,-7};
        int max=array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("N 251: MAX=" + max);

        /*
         * N 252
         *  poqragujn tarr@
         */
        int[] array1= {8,4,-2,8,4,2,-1, 0};
        int min=array1[0];
        for (int i = 1; i <array1.length ; i++) {
            if(array1[i]<min){
                min=array[i];
            }
        }
        System.out.println("N 252: Min=" + min);

        /*
         * N 253
         *  mecagujn ev poqragujn tarri gumar@
         */
        System.out.println("N 253: Max + Min=" + (max+min));

        /*
         * N 254
         *  mecagujn ev poqragujn tarri artadrjal@
         */
        System.out.println("N 254: Max * Min=" + (max*min));

        /*
         * N 255
         *  mecagujn tarri ev ir indexi gumar@
         */
        int[] array2={-8,15,-2,8,4,2,-7};
        max=array2[0];
        int index = 0;
        for (int i = 0; i <array2.length ; i++) {
            if(array2[i]>max){
                max=array2[i];
                index = i;
            }
        }
        System.out.println("N 255: MAX+index=" + (max+index));

        /*
         * N 256
         *  poqragujn tarri ev ir indexi gumar@
         */
        int[] array3={-8,-16,-2,8,4,2,-7, 8, 0, 7};
        min=array3[0];
        index = 0;
        for (int i = 0; i <array3.length ; i++) {
            if(array3[i]<min){
                min=array3[i];
                index = i;
            }
        }
        System.out.println("N 256: MIN+index=" + (min+index));

        /*
         * N 257
         *  arajin mecagujn tarri hamar@
         */
        int[] array4={6,8,8,-7, 8, 8, 7};
        max=array4[0];
        index = 0;
        for (int i = 0; i<array4.length ; i++) {
            if(array4[i]>max && array4[i]!=max){
                max=array4[i];
                index = i;
            }
        }
        System.out.println("N 257: First MAX index=" + index);

        /*
         * N 258
         *  verchin mecagujn tarri hamar@
         */
        int[] array5={6,8,8,-7, 8, 8, 7, 6};
        int m=array5[0];
        int x = 0;
        for (int i = 0; i<array5.length ; i++) {
            if(array5[i] >= m){
                m=array5[i];
                x=i;
            }
        }
        System.out.println("N 258: Last MAX index=" + x);


        /*
         * N 259
         *  arajin poqragujn tarri hamar@
         */
        int[] array6={6,8,8,-7,-7,8,-7};
        min=array6[0];
        index = 0;
        for (int i = 0; i<array6.length ; i++) {
            if(array6[i]<min && array6[i]!=min){
                min=array6[i];
                index = i;
            }
        }
        System.out.println("N 259: First MIN index=" + index);

        /*
         * N 260
         *  verchin poqragujn tarri hamar@
         */
        int[] array7={6,8,-9,-7, 8, 8, -9, 6, 0,-30};
        m=array7[0];
        x = 0;
        for (int i = 0; i<array7.length ; i++) {
            if(array7[i]<= m){
                m=array7[i];
                x=i;
            }
        }
        System.out.println("N 260: Last MIN index=" + x);
    }
}
