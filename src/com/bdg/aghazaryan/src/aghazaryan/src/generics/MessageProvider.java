package com.bdg.aghazaryan.src.aghazaryan.src.generics;

import java.util.List;

public interface MessageProvider <T> {

   public void getMessage(String test);
    String str = "New York City";


    public static void addString(List<? super String> list) {

    }
       public static void main(String args[]) {

           StringBuffer buffer = new StringBuffer(str);
           buffer.reverse();
           System.out.println(buffer);

           StringBuilder builder = new StringBuilder(str);
           builder.append(" Anahit ");
           System.out.println(builder);

       }
}

