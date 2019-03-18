package com.bdg.vkaramyan.linkedList;

public class Node <E> {
	
	Node<E> previous;
	Node<E> next;
	private E item;
	
	
	public Node(E element) {
		
		
		this.item = element;
	}


	public Node<E> getPrevious() {
		return previous;
	}


	public Node<E> getNext() {
		return next;
	}


	public E getItem() {
		return item;
	}


	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}


	public void setNext(Node<E> next) {
		this.next = next;
	}


	public void setItem(E item) {
		this.item = item;
	}


	@Override
	public String toString() {
		return "Node [previous=" + previous + ", next=" + next + ", item=" + item + "]";
	}
	
}
