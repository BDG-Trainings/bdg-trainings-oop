package com.bdg.aidaghalayan;

import java.util.Arrays;

public class Sort {



    public void bubbleSort(Integer [] ints){
    int temp;
    for(int i =0; i<ints.length; i++){
        for(int j =1; j<ints.length-i; j++){
            if(ints[j-1]>ints[j]){
                temp=ints[j-1];
                ints[j-1]=ints[j];
                ints[j]=temp;
            }

        }
    }
}

    public void selectionSort(Integer[]ints){

        for(int i = 0; i< ints.length; i++){
            int index =i;


            for(int j=i+1; j<ints.length; j++){
                if(ints[j]<ints[index]){
                    index=j;

                    int temp=ints[index];
                    ints[index]=ints[i];
                    ints[i]=temp;
                }


            }

        }
    }

    public void insertionSort(Integer []ints){
        for(int i = 0; i< ints.length; i++){
            int min=ints[i];
            int j=i-1;
            while (j>=0 && min<ints[j]){
                ints[j+1]=ints[j];
                j--;

            }
            ints[j+1]=min;

        }
    }

    public static void main(String[] args) {
        Sort s = new Sort();
        Integer [] integers=new Integer[8];
        integers[0]=4;
        integers[1]=3;
        integers[2]=2;
        integers[3]=10;
        integers[4]=12;
        integers[5]=1;
        integers[6]=5;
        integers[7]=6;
        s.selectionSort(integers);
        System.out.println(Arrays.toString(integers));

        s.insertionSort(integers);
        System.out.println(Arrays.toString(integers));




        s.bubbleSort(integers);
        System.out.println(Arrays.toString(integers));


    }

}


