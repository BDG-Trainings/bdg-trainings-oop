package com.bdg.aiskandaryan.LinkedList_ArrayList.LinkedList2;

public class Node2<N> {
    private N value;
    private Node2 previousNode2;
    private Node2 nextNode2;

    public Node2(final N value) {
        this.value = value;
        this.previousNode2 = null;
        this.nextNode2 = null;
    }

    public final N getValue() {
        return value;
    }

    public final void setValue(final N value) {
        this.value = value;
    }

    public Node2 getPreviousNode2() {
        return previousNode2;
    }

    public Node2 getNextNode2() {
        return nextNode2;
    }

    public void setPreviousNode2(final Node2 previousNode) {
        this.previousNode2 = previousNode;
    }

    public void setNextNode2(final Node2 nextNode) {
        this.nextNode2 = nextNode;
    }

    public boolean hasNext() {
        if (this.nextNode2 == null) {
            return false;
        }
        return true;
    }

    public boolean hasPrevious() {
        if (this.previousNode2 == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "value=" + value +
                ", previousNode2=" + this.hasPrevious() +
                ", nextNode2=" + this.hasNext() +
                '}';
    }
}
