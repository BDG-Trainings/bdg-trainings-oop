package com.bdg.warustamyan.list;


import java.util.Collection;
import java.util.Iterator;

public class ArrayList<E> implements Collection<E> {


    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int capacity;
    private int currentSize = 0;

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
    }

    public ArrayList(final int capacity) {
        this.capacity = capacity;
        this.elements = new Object[this.capacity];
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
    public boolean contains(final Object el) {
        for (final Object element : this.elements) {
            if (element.equals(el)) {
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
        return this.elements;
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return null;
    }

    @Override
    public boolean add(final E el) {
        if (this.currentSize == this.capacity) {
            this.increaseCapacity();
            Object[] tmp = new Object[this.capacity];
            int k = 0;
            for (final Object element : this.elements) {
                tmp[k] = element;
                k++;
            }
            this.elements = tmp;
        }
        this.elements[this.currentSize] = el;
        this.currentSize++;
        return true;
    }

    @Override
    public boolean remove(Object el) {

        if (el == null) {
            for (int i = 0; i < this.currentSize; i++) {
                if (this.elements[i] == null) {
                    return this.removeByIndex(i);
                }
            }
        } else {
            for (int i = 0; i < this.currentSize; i++)
                if (el.equals(this.elements[i])) {
                    return this.removeByIndex(i);
                }
        }
        return false;
    }

    private boolean removeByIndex(final int i) {
        System.arraycopy(this.elements, i + 1, this.elements, i, this.currentSize - i - 1);
        this.elements[--currentSize] = null;
        return true;
    }

    @Override
    public boolean containsAll(final Collection<?> collection) {

        for (final Object c : collection) {
            if (!this.contains(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(final Collection<? extends E> collection) {


        if (collection.size() + this.currentSize > this.capacity) {
            increaseCapacity();
            addAll(collection);
        } else {
            int k = this.currentSize;
            for (final E element : collection) {
                this.elements[k] = element;
                k++;
            }
            return true;
        }

        return false;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        this.elements = new Object[this.capacity];
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

    private void increaseCapacity() {
        this.capacity = (this.capacity * 3) / 2 + 1;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(3);
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.remove("D");
        System.out.println(strings);
    }
}
