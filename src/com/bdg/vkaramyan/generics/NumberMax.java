package com.bdg.vkaramyan.generics;

import java.util.ArrayList;
import java.util.List;

//DON'T use Comparable
//Use T in class level not in method scope
//And finally T should extend from some numeric type instead of comparable
public class NumberMax<T> {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(20);
		numbers.add(10);
		numbers.add(42);
		numbers.add(1);

		int max = (int) numbers.get(0);
		for (Integer Number : numbers) {
			if (Number > max) {
				max = Number;

			}

		}
		System.out.println("Max number is:" + max);

	}

}
