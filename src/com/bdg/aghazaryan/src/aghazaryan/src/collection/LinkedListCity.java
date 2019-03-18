package com.bdg.aghazaryan.src.aghazaryan.src.collection;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.function.IntFunction;

public class LinkedListCity <E> implements Collection <E> {

    Node head;
//    int size = 0;
//
//  public LinkedListCity (){
//   this.size = size;


    //}

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
      Node node = new Node();
     // node.data = data;
      node.next = null;



      if (head == null) {
          head = node;
      }
      else{
          Node n = head;


      }

        return false;
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
}
