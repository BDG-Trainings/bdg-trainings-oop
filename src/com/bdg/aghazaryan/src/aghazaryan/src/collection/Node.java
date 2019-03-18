package com.bdg.aghazaryan.src.aghazaryan.src.collection;

public class Node {

    int data;
    Node next;
    Node previous;


    public Node() {
    }

    public Node(Node next, Node previous) {
        next = next;
        previous = previous;
        //data= data;

    }
}
/*
    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode ) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }



    @Override
    public String toString() {
        return "Node{" +
                "nextNode=" + nextNode +
                ", previousNode=" + previousNode +
                '}';
    }
