package com.bdg.vqertikyan.linkedlist;

public class Node<E> {

    private E element;
    private Node next;
    private Node prev;

    public Node(E element) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}