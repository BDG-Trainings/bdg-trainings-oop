package com.bdg.vkaramyan.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//harkavora implement anel java.util.Collection y
public class ListOfArrayImpl<E> implements Collection<E> {

    //stex du iran define es anum
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object[] data;


    public ListOfArrayImpl() {

    }

    public ListOfArrayImpl(int INITIAL_CAPACITY) {
        //if -i kariq chka vorovhetev verevum define es arel 10 value-ov
        if (INITIAL_CAPACITY > 0) {
            this.data = new Object[INITIAL_CAPACITY];
        } else if (INITIAL_CAPACITY == 0) {
            this.data = new Object[10];
        } else {
            throw new IllegalArgumentException("Illegal Capacity:" + INITIAL_CAPACITY);
        }
    }

    public void ensureCapacity() {
        int oldCapacity = data.length;
        int newCapacity = oldCapacity + 10;
        data = Arrays.copyOf(data, newCapacity);
    }

    //Estex amen add anelu jamanak du size-y mecacnum es
    //harkavor- e mecacnel ayn jamanak erb tex chka array-um
//    public void add(E e) {
//
//        ensureCapacity();
//        data[size++] = e;
//    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("new capacity");

    }


    /**
     * Need to implement all this methods
     */


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(final Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(final Object o) {
        return false;
    }

    @Override
    public boolean remove(final Object o) {
        return false;
    }

    @Override
    public boolean addAll(final Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(final Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(final Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(final Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(final Object[] a) {
        return new Object[0];
    }
}
