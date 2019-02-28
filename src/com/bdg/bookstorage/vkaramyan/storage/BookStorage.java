package com.bdg.bookstorage.vkaramyan.storage;

import com.bdg.bookstorage.vkaramyan.entity.Book;

public interface BookStorage {
	
	Book bookStore();
	
	Book store();
	boolean remove();
	Book get();
	
}
