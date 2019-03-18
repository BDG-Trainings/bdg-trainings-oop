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
            E element= (E) elements[index];
            return element;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    private void reSizeArray(){
        this.size=elements.length+elements.length/2;
        elements = Arrays.copyOf(elements, size);
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

                return false;

     }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean t=false;
        for(int i=0; i< c.toArray().length; i++) {
            t= this.contains(c.toArray()[i]);
            if(t==false){
                return false;
            }
        }return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
         for (int i=0; i< c.toArray().length; i++){
            this.add((E) c.toArray()[i]);
        }return true;

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean t=false;
        for(int i=0; i<c.toArray().length; i++){
            t=this.remove(c.toArray()[i]);
        }if(t==false){
            return false;
        }
        return true;
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
        NewArrayList <Integer> arrayList= new NewArrayList<>();
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
        NewArrayList <Integer> integers= new NewArrayList<>();
        integers.add(2);
        integers.add(1);
        integers.add(3);
        integers.add(8);
        integers.add(6);
        integers.add(6);
        integers.add(6);

        System.out.println(arrayList.add(2));
        System.out.println(arrayList.addAll(integers));
        System.out.println(arrayList.toString());
        NewArrayList <Integer> integers1= new NewArrayList<>();
        integers1.add(5);
        integers1.add(1);
        System.out.println(arrayList.containsAll(integers1));












    }

}
