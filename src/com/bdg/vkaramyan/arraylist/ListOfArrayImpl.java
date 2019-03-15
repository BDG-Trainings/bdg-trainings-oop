package com.bdg.vkaramyan.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfArrayImpl<E> {
	
	
	private static final int INITIAL_CAPACITY = 10;
	private int size = 0;
	private Object [] data;
	
	
	public ListOfArrayImpl() {
		
	}
	
	public ListOfArrayImpl(int INITIAL_CAPACITY) {
		if(INITIAL_CAPACITY > 0) {
			this.data = new Object[INITIAL_CAPACITY];
		}else
			if(INITIAL_CAPACITY == 0) {
				this.data= new Object[10];
			}else {
				throw new IllegalArgumentException("Illegal Capacity:" + INITIAL_CAPACITY);
			}
	}
	
	public void ensureCapacity() {
		int oldCapacity = data.length;
		int newCapacity = oldCapacity + 10;
		data = Arrays.copyOf(data, newCapacity);
	}
	
	public void add(E e) {
		
		ensureCapacity();
		data[size++] = e;
	}

	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<String>();
		arrayList.add("new capacity");
		
	}
}
