package com.bdg.vkaramyan.generics;



public class NumberMax {

	public static <T extends Comparable <T>> T max(T... elements) {
		T max = elements[0];
	    for (T element : elements) {
	        if (element.compareTo(max) > 0) {
	            max = element;
	        }
	    }
	    return max;
	    
	}
	
	public static void main(String[] args) {
		System.out.println("Maximum number is: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89)));
	}
}
