package com.bdg.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class NewLinkedList<E> implements Collection<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public NewLinkedList() {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }
    private static class Node<T> {
        T element;
        Node<T> prev;
        Node<T> next;

        public Node(final Node<T> prev, final T element, final Node<T> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }



    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }

        return false;
    }

    @Override
    public boolean contains(Object object) {
        Node<E> current = this.head;
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
        if (this.size == 0) {
            return null;
        }
        Object[] objects = new Object[this.size];

        Node<E> current = head.next;
        int k = 0;
        objects[k] = head.element;
        k++;
        while (k < this.size) {
            objects[k] = current.element;
            current = current.next;
            k++;
        }
        return objects;
    }


    @Override
    public <T> T[] toArray(T[] a) {

        return null;
    }

    @Override
    public boolean add(Object e) {
        final Node<E> l = this.tail;
        final Node<E> node = new Node<E>(l, (E) e, null);
        this.tail = node;
        if (l == null) {
            this.head = node;
        } else {
            l.next = node;
        }
        this.size++;
        return true;
    }


    @Override
    public boolean remove(Object object) {
        if (this.head.element.equals(object)) {
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
            return true;
        }
        Node<E> current = this.head.next;

        while (current != null) {
            if (current.element.equals(object)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                this.size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }


        @Override
    public boolean containsAll(Collection<?> collection) {
            for (final Object object : collection) {
                if (!this.contains(object)) {
                    return false;
                }
            }
            return true;
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
        if (head == null && tail == null) {
            return "[]";
        } else {
            final StringBuilder sb = new StringBuilder();
            sb.append("[").append(this.head.element).append(", ");
            Node<E> current = this.head.next;
            while (current != null) {
                sb.append(current.element).append(", ");
                current = current.next;
            }
            sb.replace(sb.length() - 2, sb.length(), "");
            sb.append("]");
            return sb.toString();
        }
    }


    public static void main(String[] args) {
        final NewLinkedList <String> linkedList = new NewLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList);

    }



    }

