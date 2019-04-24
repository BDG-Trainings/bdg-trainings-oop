package com.bdg.aidaghalayan.exercises;

public class Palindrome {
    String n;

    public Palindrome(String a) {
        this.n=a;
    }

    public String getPalindrome() {
           for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) != n.charAt((n.length()-1)-i)) {
                    return "String is not Palindrome";
                }
            }return n;
        }

    public static void main(String[] args){
        Palindrome p =new Palindrome("ABdedBA");
       System.out.println(p.getPalindrome());

    }
}


