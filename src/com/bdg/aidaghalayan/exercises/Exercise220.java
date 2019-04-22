package com.bdg.aidaghalayan.exercises;

public class Exercise220 {
    public static void main(String[] args) {
        int n =6;
        int[]array={2,5,-5,-8,6, 0};
        int countPlus=0;
        int countMinus=0;
        for(int i=0; i< array.length; i++){
            if (array[i]>0 && array[i]!=0){
                countPlus++;

            }
            else if(array[i]<0 && array[i]!=0){
                countMinus++;
            }
        }
        System.out.println("positive numbers :"+countPlus);
        System.out.println("negative numbers :"+countMinus);
    }
}
