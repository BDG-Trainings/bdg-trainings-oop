package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.vkaramyan.common.BookCreateParameter;
import com.bdg.bookstorage.vkaramyan.common.BookUpdateParameter;
import com.bdg.bookstorage.vkaramyan.entity.Book;

public interface BookService {
	
	Book create(BookCreateParameter bookCreateParameter);
	Book update(BookUpdateParameter bookUpdateParameter);
	boolean delete();
	Book get();
	

}
