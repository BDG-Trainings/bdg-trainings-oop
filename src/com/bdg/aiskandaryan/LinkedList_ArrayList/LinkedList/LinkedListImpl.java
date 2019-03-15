package com.bdg.aiskandaryan.LinkedList_ArrayList.LinkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        System.out.println(LL);
        LL.addNode(node1);
        System.out.println(LL);
        LL.addNode(node2);
        System.out.println(LL);

        LL.addNode(node3);
        System.out.println(LL);
        LL.switchNodes(LL.get(1), LL.get(2));
        System.out.println(LL);

        System.out.println(LL.get(1));

    }
}
