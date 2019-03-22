package com.bdg.vkaramyan.linkedList;

import java.util.Collection;
import java.util.Iterator;


public class LinkedListImpl<E> implements Collection<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size = 0;
	
	
	

	public LinkedListImpl() {
		
	}


	@Override
	public int size() {
		return this.size;
		
	}
	

	@Override
	public boolean isEmpty() {
		
		return this.size == 0;
	}

	@Override
	public boolean contains(Object o) {
		Node<E> current = this.head;
		if(current != null) {
			if(current.getItem().equals(o)) {
					return true;
				
			}
		}
		
		while(current.getItem().equals(o)) {
			if(current.next.getItem().equals(o)) {
				return true;
			}
			
			current = current.next;
		}
		
		
		return false;
	}
	

	@Override
	public Iterator<E> iterator() {
		
		return null;
	}
	

	@Override
	public Object[] toArray() {
		if(this.size == 0) {
			return null;
		}
		
		Object[] array = new Object[this.size()];
		
		Node<E> current = head.next;
		
		int i = 0;
		array[i] = head.getItem();
		
			i++;
			while(i< this.size) {
				array[i] = current.getItem();
				current = current.next;
				i++;
		}
			
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		/*T[] result = a;
		if(size() > result.length) {
			result = T[size()];
		}
		
		int i = 0;
		for (E item : this) {
			result [i] = item;
			i++;
		}
		
		if (result.length > i) {
			result[i] = null;
		}
		
		
		return (T[]) result;*/
		
		return null;
	}

	@Override
	public boolean add(E item) {
		
		Node<E> t = this.tail;
		Node<E> node = new Node<E>((Node<E>) item, t,null);
		this.tail = node;
		if(t == null) {
			this.head = node;
			}else {
				t.next = node;
			}
		this.size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		 if (this.head.getItem().equals(o)) {
	            this.head = this.head.next;
	            this.head.previous = null;
	            this.size--;
	            return true;
	        }

	        Node<E> current = this.head.next;

	        while (current != null) {
	            if (current.getItem().equals(o)) {
	                current.previous.next = current.next;
	                current.next.previous = current.previous;
	                this.size--;
	                return true;
	            }
	            current = current.next;
	        }

	        return false;
	    }


	@Override
	public boolean containsAll(Collection<?> c) {
		 for (final Object object : c) {
	            if (!this.contains(object)) {
	                return false;
			}
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		for (int i = 0; i < c.size(); i++) {
			for(Iterator<? extends E> iterator = c.iterator(); iterator.hasNext();) {
				if(!add((E)iterator.next())) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		
		

	}


	/*@Override
	public boolean hasNext() {
		
		return head != null;
	}


	@Override
	public E next() {
		
		if(head == null) {
			throw new NoSuchElementException();
			
		}
		
		head = head.getNext();
		
		return next();
	}*/
	
	 @Override
	    public String toString() {
	        if (head == null && tail == null) {
	            return "[]";
	        } else {
	            final StringBuilder sb = new StringBuilder();
	            sb.append("[").append(this.head.getItem()).append(", ");
	            Node<E> current = this.head.next;
	            while (current != null) {
	                sb.append(current.getItem()).append(", ");
	                current = current.next;
	            }
	            sb.replace(sb.length() - 2, sb.length(), "");
	            sb.append("]");
	            return sb.toString();
	        }
	    }

	    

	    public static void main(String[] args) {
	        final LinkedListImpl<String> linkedList = new LinkedListImpl<>();
	        linkedList.add("A");
	        linkedList.add("B");
	        linkedList.add("C");
	        System.out.println(linkedList);

	    }

}
