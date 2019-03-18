package com.bdg.osahakyan.collection;

import java.util.Collection;
import java.util.Iterator;


public class ArrayList<Е> implements Collection<Е> {

    // Definition of custom ArrayList
    private static final int DEFAULT_CAPACITY = 11;
    private Object[] elementData = {};

    // Constructor of custom ArrayList
    public ArrayList(){
        this.elementData = new Object[DEFAULT_CAPACITY];
    if( elementData.length >= DEFAULT_CAPACITY ){
        this.elementData = new  Object[elementData.length + DEFAULT_CAPACITY];
    }}


    @Override
    public int size() {
        return this.elementData.length;
    }

    @Override
    public boolean isEmpty() {
        if (elementData.length == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object element) {
        for (Object elements: this.elementData  ){
            if(elements.equals(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return this.elementData;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    public static void main(String[] args){

    }
}

