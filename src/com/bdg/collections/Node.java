package com.bdg.collections;

public class Node <E>{

    private E item;
    private Node next;
    private Node prev;

    public Node(E item, Node next, Node prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
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
                "item=" + item +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
