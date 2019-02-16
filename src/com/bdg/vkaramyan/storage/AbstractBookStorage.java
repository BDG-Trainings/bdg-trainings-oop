package com.bdg.vkaramyan.storage;

import com.bdg.vkaramyan.entitys.Book;

public abstract class AbstractBookStorage extends Storage {
	
	protected Book bookStore;
	

	 public AbstractBookStorage(int size, Book bookStore) {
		super(size);
		this.bookStore = bookStore;
		
	}
	 
	 public abstract Book store(Book book);
	 public abstract boolean remove(Book book);
	 public abstract Book get(int id);
	 
}
