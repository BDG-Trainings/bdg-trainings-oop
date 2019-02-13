package com.bdg.vkaramyan.services;

import com.bdg.vkaramyan.createUpdateObject.AuthorCreateParameter;
import com.bdg.vkaramyan.createUpdateObject.BookUpdateParameter;
import com.bdg.vkaramyan.entitys.Author;

public abstract class AbstractAuthorService {
	
	public abstract Author get(int id);
	public abstract Author create(AuthorCreateParameter params);
	public abstract Author update(BookUpdateParameter params);
	public abstract boolean delete(int id);
	

}
