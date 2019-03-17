package com.bdg.aiskandaryan.LinkedList_ArrayList.LinkedList2;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList2<T> implements Collection<T> {

    private Node2 firstNode2;
    private Node2 lastNode2;
    private int size;

    public LinkedList2() {
        this.firstNode2 = null;
        this.lastNode2 = null;
        this.size = 0;
    }

    public Node2 getFirstNode2() {
        return firstNode2;
    }

    public Node2 getLastNode2() {
        return lastNode2;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Node2[] toArray() {
        if (this.size > 0) {
            Node2[] arr = new Node2[this.size];
            int i = 0;
            return arr;

        } else {
            return null;
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(final T t) {
        return false;

    }

    @Override
    public boolean add(Node2 node2) {
        if (firstNode2 == null && lastNode2 == null) {
            node2.setPrev (null);
            firstNode = node;
        } else {
            node.setPreviousNode(this.lastNode);
            lastNode.setNextNode(node);
        }
        node.setNextNode(null);
        lastNode = node;

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
    public boolean addAll(final Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Node2> c) {
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
