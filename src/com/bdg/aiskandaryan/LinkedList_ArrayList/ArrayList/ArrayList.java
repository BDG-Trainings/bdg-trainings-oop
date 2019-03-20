package com.bdg.aiskandaryan.LinkedList_ArrayList.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList<E> implements Collection<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int capacity;
    private int currentSize = 0;

    public int getCurrentSize() {
        return currentSize;
    }

    public ArrayList(final int capacity) {
        this.elements = new Object[capacity];
        this.capacity = capacity;
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(final Collection<E> elements) {
        if (elements.size() < DEFAULT_CAPACITY) {
            this.capacity = DEFAULT_CAPACITY;
        } else {
            this.capacity = elements.size() + DEFAULT_CAPACITY;
        }
        this.elements = new Object[this.capacity];
        this.currentSize = elements.size();
        int i = 0;
        for (final Object o: elements) {
            this.elements[i] = o;
            i++;
        }
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
    public boolean contains(final Object o) {
        for (final Object element: this.elements) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && elements[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E)elements[currentIndex++];
            }
        };
        return it;
    }

    @Override
    public Object[] toArray() {
        return this.elements;
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return null;
    }

    private void doubleCapacity() {
        this.capacity = 2 * this.capacity;
        Object[] newElements = new Object[capacity];
        for (int i = 0; i < this.currentSize; i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
    }

    @Override
    public boolean add(final E e) {
        if (this.currentSize == this.capacity) {
            doubleCapacity();
            Object[] tmp = new Object[this.capacity];
            for (int i = 0; i < this.currentSize; i++) {
                tmp[i] = this.elements[i];
            }
            this.elements = tmp;
        }
        this.elements[currentSize] = e;
        this.currentSize++;
        return true;
    }

    public boolean removeByIndex(final int i) {
        if (i >= this.currentSize) {
            System.out.println("Remove By Index: wrong index is specified!!!");
            return false;
        } else {
            System.arraycopy(this.elements, i + 1, this.elements, i, this.currentSize - i - 1);
            this.elements[currentSize - 1] = null;
            currentSize--;
            return true;
        }
    }

    @Override
    public boolean remove(final Object o) {
        if (o == null || !contains(o)) {
            return false;
        }
        for (int i = 0; i < this.currentSize; i++) {
            if (o.equals(this.elements[i])) {
                removeByIndex(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> collection) {
        for(final Object o: collection) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(final Collection<? extends E> collection) {
        if (collection.size() + this.currentSize > this.capacity) {
            while (collection.size() + this.currentSize > this.capacity) {
                doubleCapacity();
            }
        }
        for(final E element: collection) {
            this.elements[currentSize] = element;
            currentSize++;
        }
        return false;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        for (final Object element: c) {
            remove(element);
        }
        return true;
    }

    @Override
    public boolean retainAll(final Collection<?> collection) {
        boolean[] elementBelongs = new boolean[this.currentSize];
        Arrays.fill(elementBelongs, false);
        for(final Object el: collection) {
            for (int i = 0; i < this.currentSize; i++) {
                if (elements[i].equals(el)) {
                    elementBelongs[i] = true;
                }
            }
        }
        for (int i = 0; i < this.currentSize; i++) {
            if (!elementBelongs[i]) {
                removeByIndex(i);
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < currentSize; i++) {
            this.elements[i] = null;
        }
        this.currentSize = 0;
    }
}
