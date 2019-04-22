package com.bdg.aidaghalayan.exercises;

public class Exercise55 {
    public static void main(String[] args) {
        int i = 251;
        int miavor = i % 100 % 10;
        int tasnavor = i / 10 % 10;
        int haryuravor = i / 100;
        if (miavor < tasnavor && miavor < haryuravor) {
            System.out.println(miavor);
        } else if (tasnavor < miavor && tasnavor < haryuravor) {
            System.out.println(tasnavor);
        } else if (haryuravor < miavor && haryuravor < tasnavor) {
            System.out.println(haryuravor);
        }
    }
}
