package com.bdg.aidaghalayan.exercises;

public class Exercise211 {
    public static void main(String[] args) {
        int n= 5;
        int [] array= new int [n];
        array[0]=5;
        array[1]=-6;
        array[2]=2;
        array[3]=-8;
        array[4]=1;
        int count=0;
        int sum=0;
        for(int i=0; i<array.length; i++){
            if(array[i]>0){
              count++;
              sum=sum+array[i];
            }

        }
        System.out.println((double) sum/count);



    }
}
