package com.bdg.aiskandaryan.LinkedList_ArrayList.LinkedList2;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList2<T> implements Collection<T> {

    private Node2 first;
    private Node2 last;
    private int size;

    public LinkedList2() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Node2 getFirst() {
        return first;
    }

    public Node2 getLast() {
        return last;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) { // if first == null ...
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        Iterator itr = this.iterator();
        do {
            if (itr.equals(o)) {
                return true;
            }
        } while (itr.hasNext());
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private Node2 node = first;
            @Override
            public boolean hasNext() {
                return node.hasNext();
            }

            @Override
            public T next() {
                if (!hasNext()) { throw new UnsupportedOperationException(); }
                node = node.getNextNode2();
                return (T) node;
            }
        };
        return it;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node2<T> x = first; x != null; x = x.getNextNode2())
            result[i++] = x;
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {

        return null;
    }

    @Override
    public boolean add(final T t) {
        if (size > 0) {
            last.setNextNode2((Node2)t);
            ((Node2) t).setPreviousNode2(last);
        } else {
            first = (Node2)t;
            ((Node2) t).setPreviousNode2(null);
        }
        last = (Node2) t;
        ((Node2) t).setNextNode2(null);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (Node2<T> x = first; x != null; x.getNextNode2()) {

        }

        if (o == null) {
            System.out.println("Invalid Node specified !!!");
            return false;
        }/*
        if (o.hasNext() && node.hasPrevious()) { // if node is the ONLY Node
            this.firstNode = null;
            this.lastNode = null;
            return;
        }
        if (node.hasNext()) { // if node is last Node
            node.getPreviousNode().setNextNode(null);
            node.setPreviousNode(null);
            return;
        }
        if (node.hasPrevious()) { // if node is first Node
            node.getNextNode().setPreviousNode(null);
            node.setNextNode(null);
        }
        node.getNextNode().setPreviousNode(node.getPreviousNode());
        node.getPreviousNode().setNextNode(node.getNextNode());
*/
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
