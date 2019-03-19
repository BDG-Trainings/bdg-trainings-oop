package com.bdg.collections;

import java.util.*;

public class NewArrayList <E> implements Collection<E> {
    private Object[] elements ;
    private int count=0;
    private int size=10;



    public NewArrayList(){
        elements = new Object[this.size];
    }



    private E get(int index) {
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
        return this.count;
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
       T []t= (T[]) new Object[this.count];
       for(int i =0; i<count; i++){
            for(int j=0; j<a.length; j++){
                if(elements[i]==a[j]&& elements[i]!=null){

                  t[i] = (T) elements[i];
                }
            }
        }


        return t;
    }

    @Override
    public boolean add(E e) {
        if(count==elements.length){
            this.reSizeArray();
        }

        elements[count++] = e;
        return true;
    }

    private boolean removeByIndex(final int i) {
        System.arraycopy(this.elements, i + 1, this.elements, i, this.count - i - 1);
        this.elements[--count] = null;
        return true;
    }

    @Override
    public boolean remove(Object object) {
        if (object == null) {
            for (int i = 0; i < this.count; i++) {
                if (this.elements[i] == null) {
                    return this.removeByIndex(i);
                }
            }
        } else {
            for (int i = 0; i < this.count; i++)
                if (object.equals(this.elements[i])) {
                    return this.removeByIndex(i);
                }
        }
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
        for(int i=0; i<elements.length; i++) {
            for (int j = 0; j < c.toArray().length; j++) {
                if (elements[i] != c.toArray()[j]) {
                    this.remove(elements[i]);
                    return true;
                }
            }

        }
         return false;
    }

    @Override
    public void clear() {
       for(int i=0; i<count; i++){
          elements[i]=null;

       }count=0;
    }

    @Override
    public String toString() {
        final StringBuilder toString = new StringBuilder();
        toString.append("[");

        for (final Object element : elements) {
            if (element == null) {
                toString.append("null, ");
            } else {
                toString.append(element.toString()).append(", ");
            }
        }

        toString.replace(toString.length() - 2, toString.length(), "");
        toString.append("]");
        return toString.toString();
    }


    public static void main(String[] args) {
        NewArrayList <Integer> arrayList= new NewArrayList<>();
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(54);

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
        integers1.add(6);
        integers1.add(6);
        System.out.println(arrayList.containsAll(integers1));
        System.out.println(arrayList.removeByIndex(2));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.remove(8));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());
        Object []t = new Object[2];
        t[0]=6;
        t[1]=54;
        Object []t1= arrayList.toArray(t);
        System.out.println(Arrays.toString(t1));

        System.out.println(arrayList.removeAll(integers1));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());
        NewArrayList <Integer> integers2= new NewArrayList<>();
        integers2.add(6);
        integers2.add(3);
        System.out.println(arrayList.retainAll(integers2));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());















    }

}
