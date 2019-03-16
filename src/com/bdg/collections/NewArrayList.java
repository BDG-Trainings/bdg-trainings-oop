package com.bdg.collections;

import java.util.*;

public class NewArrayList <E> implements Collection<E> {
    private Object[] elements ;
    private int count=0;
    private int size=10;



    public NewArrayList(){
        elements = new Object[this.size];
    }



    public E get(int index) {
        if(index < count){
            E elem= (E) elements[index];
            return elem;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    private void reSizeArray(){
        elements = Arrays.copyOf(elements, elements.length/2);
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count==0){
            return true;
        }

        return false;
    }

        @Override
    public boolean contains(Object object) {
        for(int i=0; i<count; i++){
            if(elements[i]==object){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


    @Override
    public Object[] toArray() {
        Object[]objects= new Object[count];
        for(int i=0; i<count; i++){
            objects[i]=elements[i];


        }
        return objects;
    }


    @Override
    public <T> T[] toArray(T[] a) {

        return null;
    }

    @Override
    public boolean add(E e) {
        if(count==elements.length){
            this.reSizeArray();
        }
        elements[count++] = e;
        return true;
    }

    @Override
    public boolean remove(Object object) {
        Object [] objects= new Object[this.count];
        boolean t= false;
        int k=0;
        for(int i=0; i<count; i++) {

            if (elements[i] != object) {
                elements[k] = object;
                k++;

            } else {
                t = true;
            }
        }
            count=k;
            elements=objects;
            return t;

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
        return;

    }

    @Override
    public String toString() {
        return "NewArrayList{" +
                "elements=" + Arrays.toString(elements) +
                ", count=" + count +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        NewArrayList<Integer> arrayList= new NewArrayList<>();
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(5);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(10));

        Object[]objects=arrayList.toArray();
        System.out.println(Arrays.toString(objects));

        System.out.println(arrayList.size());






    }

}
