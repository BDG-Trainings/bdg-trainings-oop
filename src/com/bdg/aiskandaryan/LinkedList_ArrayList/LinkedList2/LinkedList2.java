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
    public <T> T[] toArray(T[] a) { return null; }

    @Override
    public boolean add(final T t) {
        Node2<T> newNode = new Node2<>(t);
        if (size > 0) {
            last.setNextNode2(newNode);
            newNode.setPreviousNode2(last);
        } else {
            first = newNode;
            newNode.setPreviousNode2(null);
        }
        last = newNode;
        newNode.setNextNode2(null);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            System.out.println("Invalid Node specified !!!");
            return false;
        }
        Node2 node = (Node2)o;
        if (first.equals(node) && last.equals(node)) { // if node is the ONLY Node
            this.first = null;
            this.last = null;
            size--;
            return true;
        }
        if (last.equals(node)) { // if node is last Node
            last.getPreviousNode2().setNextNode2(null);
            last.setPreviousNode2(null);
            size--;
            return true;
        }
        if (first.equals(node)) { // if node is first Node
            first.getNextNode2().setPreviousNode2(null);
            first.setNextNode2(null);
            size--;
            return true;
        }
        node.getNextNode2().setPreviousNode2(node.getPreviousNode2());
        node.getPreviousNode2().setNextNode2(node.getNextNode2());
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for(final Object o: collection) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(final Collection<? extends T> collection) {
        for(final T element: collection) {
            add(element);
            size++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        for(final Object element: collection) {
            remove(element);
            size--;
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (Node2<T> x = first; x != null; x = x.getNextNode2()){

        }
        return false;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;

    }
}
