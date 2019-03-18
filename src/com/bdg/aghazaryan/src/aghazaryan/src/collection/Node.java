package com.bdg.aghazaryan.src.aghazaryan.src.collection;

public class Node {
    private Node nextNode;
    private Node previousNode;
    private int data;

    private Node() {
    }

    private Node(int value, Node next, Node previous) {
        data = data;
        nextNode = next;
        previousNode = previous;

    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nextNode=" + nextNode +
                ", previousNode=" + previousNode +
                ", data=" + data +
                '}';
    }
}