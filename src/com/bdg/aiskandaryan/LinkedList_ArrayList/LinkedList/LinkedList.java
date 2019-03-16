package com.bdg.aiskandaryan.LinkedList_ArrayList.LinkedList;

import java.util.Collection;

public class LinkedList {
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    @Override
    public String toString() {
        String res = "";
        Node tmp = this.firstNode;
        int i = 1;
        while (this.firstNode != null && tmp != null) {
            res += "\n index = " + i + " value = " + tmp.getValue();
            tmp = tmp.getNextNode();
            i++;
        }
        return "LinkedList{" + res + "\n }";
    }

    public void addNode(Node node) {
        if (firstNode == null && lastNode == null) {
            node.setPreviousNode(null);
            firstNode = node;
        } else {
            node.setPreviousNode(this.lastNode);
            lastNode.setNextNode(node);
        }
        node.setNextNode(null);
        lastNode = node;
    }

    public void removeNode(Node node) {
        if (node == null) {
            System.out.println("Invalid Node specified !!!");
            return;
        }
        if (node.hasNext() && node.hasPrevious()) { // if node is the ONLY Node
            this.firstNode = null;
            this.lastNode = null;
            return;
        }
        if (node.hasNext()) { // if node is last Node
            node.getPreviousNode().setNextNode(null);
            node.setPreviousNode(null);
            return;
        }
        if (node.hasPrevious()) { // if node is first Node
            node.getNextNode().setPreviousNode(null);
            node.setNextNode(null);
        }
        node.getNextNode().setPreviousNode(node.getPreviousNode());
        node.getPreviousNode().setNextNode(node.getNextNode());
    }

    public Node get(final int index) {
        if (firstNode == null) {
            System.out.println("The Linked List is empty !!!");
            return null;
        }
        if (index < 1) {
            System.out.println("Negative index specified !!!");
            return null;
        }
        Node res = null;
        Node tmp = firstNode;
        int i = 1;
        while (tmp != null) {
            if (i == index) {
                res = tmp;
                break;
            }
            tmp = tmp.getNextNode();
            i++;
        }
        return res;
    }

    private boolean belongsToList(final Node node) {
        if (node == null) {
            System.out.println("null Node provided !!!");
            return false;
        }
        Node tmp = firstNode;
        while (tmp != null) {
            if (tmp == node) {
                return true;
            }
            tmp = tmp.getNextNode();
        }
        return false;
    }

    public boolean switchNodes(Node a, Node b) {
        // Check if switching Nodes is possible
        if (a == null || b == null || belongsToList(a) == false || belongsToList(b) == false) {
            System.out.println("Any of provided Nodes are invalid !!!");
            return false;
        }
        if (a == b) {
            System.out.println("Provided Nodes are the same !!!");
            return false;
        }

        // Change references to a and b from next and previous Nodes
        if (a.hasNext()) {
            a.getNextNode().setPreviousNode(b);
        }
        if (b.hasNext()) {
            b.getNextNode().setPreviousNode(a);
        }
        if (a.hasPrevious()) {
            a.getPreviousNode().setNextNode(b);
        }
        if (b.hasPrevious()) {
            b.getPreviousNode().setNextNode(a);
        }

        // Change references to next and previous Nodes
        if (a.getNextNode() == b) {
            a.setNextNode(b.getNextNode());
            b.setNextNode(a);
            a.setPreviousNode(b);
            b.setPreviousNode(a.getPreviousNode());
        } else if (b.getNextNode() == a) {
            b.setNextNode(a.getNextNode());
            a.setNextNode(b);
            b.setPreviousNode(a);
            a.setPreviousNode(b.getPreviousNode());
        } else {
            Node tmp = null;
            tmp = a.getNextNode();
            a.setNextNode(b.getNextNode());
            b.setNextNode(tmp);
            tmp = a.getPreviousNode();
            a.setPreviousNode(b.getPreviousNode());
            b.setPreviousNode(tmp);
        }

        // Assign new values to firstNode and lastNode (if needed)
        if (firstNode == b) {
            firstNode = a;
        } else if (firstNode == a) {
            firstNode = b;
        }
        if (lastNode == b) {
            lastNode = a;
        } else if (lastNode == a) {
            lastNode = b;
        }

        return true;
    }
}
