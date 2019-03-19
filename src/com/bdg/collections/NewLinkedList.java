package com.bdg.collections;

import java.util.Collection;
import java.util.Iterator;

public class NewLinkedList<E> implements Collection<E> {
    private Node head;
    private Node tail;
    private int size=10;

    public NewLinkedList() {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }



    @Override
    public int size() {

        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(this.size==0){
            return true;
        }

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
    public boolean add(Object e) {
        if(head==null){
            head=new Node( e, null,null);

        }else {
            Node node= new Node(e, tail, head);
            this.tail=node;


        }
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

    @Override
    public String toString() {
        return "NewLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        NewLinkedList<Integer> list= new NewLinkedList<>();

        System.out.println(list.isEmpty());
        list.add(1);
        System.out.println(list.toString());
        list.add(5);
        System.out.println(list.toString());
        list.add(8);
        list.add(10);
        System.out.println(list.size());
        System.out.println(list.add(2));


        System.out.println(list.isEmpty());




    }
}
