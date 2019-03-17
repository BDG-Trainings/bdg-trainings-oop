package com.bdg.vqertikyan.linkedlist;

import java.util.Collection;
import java.util.Iterator;



public class VLinkedList<E> implements Collection<E> {

    private Node head;
    private Node tail;
    private int size;


    @Override
    public boolean add(E e) {
        Node node = new Node(e);
        size++;
        if (head == null){
            head = node;
            tail = head;
            return true;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            return true;
        }
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

        return a;
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


    static class App {
        public static void main(String[] args) {
            VLinkedList vLinkedList = new VLinkedList();
            vLinkedList.add(5);
            vLinkedList.add(10);
            vLinkedList.add(15);
            System.out.println(vLinkedList);

        }
    }
}