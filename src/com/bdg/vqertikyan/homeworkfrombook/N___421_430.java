package com.bdg.vqertikyan.homeworkfrombook;

import java.util.Arrays;
import java.util.Random;

public class N___421_430 {

    public static void main(String[] args) {

        int count = 0;
        int m = 4;
        int[][] xy = new int[m][m];


        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
            xy[i][k] = random.nextInt(5);
            }
        }

        System.out.println(Arrays.deepToString(xy).replace("], ","]\n").replace("]]","]").replace("[[","["));

        //428
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                if (i+k+1 >= m && xy[i][k]==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
