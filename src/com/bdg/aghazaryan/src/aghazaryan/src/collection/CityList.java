package com.bdg.aghazaryan.src.aghazaryan.src.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class CityList<E> implements Collection<E> {

    ArrayList<String> cityNames = new ArrayList<String>();

    public CityList() {
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override

    public boolean add(E e) {
        cityNames.add("San Francisco ");
        cityNames.add("New York City ");
        cityNames.add("Florence ");
        cityNames.add("Prague ");
        cityNames.add("London ");
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }


    public static void main(String[] args) {

        CityList<String> CityList = new CityList<>();
        CityList.add("ddff");
        System.out.println(CityList);



    }
}
