package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.vkaramyan.entity.Book;

public interface BookService {
	
	Book create();
	Book update();
	boolean delete();
	Book get();
	

}
