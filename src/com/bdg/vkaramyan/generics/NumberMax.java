package com.bdg.vkaramyan.generics;


//DON'T use Comparable
//Use T in class level not in method scope
//And finally T should extend from some numeric type instead of comparable
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
