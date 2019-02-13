package com.bdg.vkaramyan.services;

import com.bdg.vkaramyan.createUpdateObject.BookCreateParameter;
import com.bdg.vkaramyan.createUpdateObject.BookUpdateParameter;
import com.bdg.vkaramyan.entitys.Book;

public abstract class AbstractBookService {
	
	public abstract Book get(int id);
	public abstract Book create(BookCreateParameter params);
	public abstract Book update(BookUpdateParameter params);
	public abstract boolean delete(int id);
	
}
