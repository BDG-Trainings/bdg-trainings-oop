package com.bdg.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class newArrayList <E> implements Collection<E> {
    private Object[] o ;
    private int count=0;
    private int size=10;



    public newArrayList(){
        o = new Object[this.size];
    }



    public E get(int index) {
        if(index < count){
            E elem= (E) o[index];
            return elem;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    private void reSizeArray(){
        o = Arrays.copyOf(o, o.length/2);
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
            if(o[i]==object){
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
            objects[i]=o[i];


        }
        return objects;
    }


    @Override
    public <T> T[] toArray(T[] a) {

        return null;
    }

    @Override
    public boolean add(E e) {
        if(count==o.length){
            this.reSizeArray();
        }
        o[count++] = e;
        return true;
    }

    @Override
    public boolean remove(Object object) {

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
        return;

    }

    @Override
    public String toString() {
        return "newArrayList{" +
                "o=" + Arrays.toString(o) +
                ", count=" + count +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        newArrayList<Integer> arrayList= new newArrayList<>();
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(5);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(10));
        System.out.println(arrayList.iterator());
        Object[]objects=arrayList.toArray();
        System.out.println(Arrays.toString(objects));
        System.out.println(arrayList.remove(8));
        arrayList.clear();
        System.out.println(arrayList.size());





    }

}
