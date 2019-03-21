package com.bdg.master.linkedlist;


import java.util.Collection;
import java.util.Iterator;

public class LinkedList<E> implements Collection<E> {


    private Node<E> first;
    private Node<E> last;
    private int currentSize = 0;

    public LinkedList() {

    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    @Override
    public boolean contains(final Object object) {
        Node<E> current = this.first;
        if (current != null) {
            if (current.element.equals(object)) {
                return true;
            }
            while (current.next != null) {
                if (current.next.element.equals(object)) {
                    return true;
                }
                current = current.next;
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
        if (this.currentSize == 0) {
            return null;
        }
        Object[] objects = new Object[this.currentSize];

        Node<E> current = first.next;
        int k = 0;
        objects[k] = first.element;
        k++;
        while (k < this.currentSize) {
            objects[k] = current.element;
            current = current.next;
            k++;
        }
        return objects;
    }

    @Override
    public <T> T[] toArray(final T[] array) {
        return null;
    }

    @Override
    public boolean add(final E element) {
        final Node<E> l = this.last;
        final Node<E> node = new Node<>(l, element, null);
        this.last = node;
        if (l == null) {
            this.first = node;
        } else {
            l.next = node;
        }
        this.currentSize++;
        return true;
    }

    @Override
    public boolean remove(final Object object) {
        if (this.first.element.equals(object)) {
            this.first = this.first.next;
            this.first.prev = null;
            this.currentSize--;
            return true;
        }

        Node<E> current = this.first.next;

        while (current != null) {
            if (current.element.equals(object)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                this.currentSize--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> collection) {
        for (final Object object : collection) {
            if (!this.contains(object)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(final Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(final Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(final Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString() {
        if (first == null && last == null) {
            return "[]";
        } else {
            final StringBuilder sb = new StringBuilder();
            sb.append("[").append(this.first.element).append(", ");
            Node<E> current = this.first.next;
            while (current != null) {
                sb.append(current.element).append(", ");
                current = current.next;
            }
            sb.replace(sb.length() - 2, sb.length(), "");
            sb.append("]");
            return sb.toString();
        }
    }

    private class Node<T> {
        T element;
        Node<T> prev;
        Node<T> next;

        Node(final Node<T> prev, final T element, final Node<T> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        final LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList);

    }
}
