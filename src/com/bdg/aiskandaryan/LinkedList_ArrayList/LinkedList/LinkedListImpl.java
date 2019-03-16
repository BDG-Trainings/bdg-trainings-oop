package com.bdg.aiskandaryan.LinkedList_ArrayList.LinkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        System.out.println(LL);
        LL.addNode(node1);
        LL.addNode(node2);
        System.out.println(LL);
        LL.addNode(node3);
        LL.addNode(node4);
        LL.addNode(node5);
        System.out.println(LL);

        LL.switchNodes(LL.get(2), LL.get(4));
        System.out.println(LL);
        try {
            LL.get(11).setValue(15);
        } catch (NullPointerException e) {
            System.err.println("wrong index specified !!!");
        }
        System.out.println(LL);
/*
        System.out.println(LL.get(1));
        System.out.println(LL.get(2));
        System.out.println(LL.get(3));
*/
    }
}
