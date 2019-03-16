package com.bdg.akarapetyan.linkedlist;

import java.util.LinkedList;

public class Node <N extends Number> {
    private N value;
    private Node previousNode;
    private Node nextNode;

    public Node(final N value) {
        this.value = value;
        this.previousNode = null;
        this.nextNode = null;
    }

    public final N getValue() {
        return value;
    }

    public final void setValue(final N value) {
        this.value = value;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setPreviousNode(final Node previousNode) {
        this.previousNode = previousNode;
    }

    public void setNextNode(final Node nextNode) {
        this.nextNode = nextNode;
    }

    public boolean hasNext() {
        if (this.nextNode == null) {
            return false;
        }
        return true;
    }

    public boolean hasPrevious() {
        if (this.previousNode == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", previousNode=" + this.hasPrevious() +
                ", nextNode=" + this.hasNext() +
                '}';
    }
}
