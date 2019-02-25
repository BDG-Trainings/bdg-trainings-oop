package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.vkaramyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vkaramyan.entity.Author;

public class AuthorServiceImpl implements AuthorService{

	@Override
	public Author create(AuthorCreateParameter authorCreateParameter) {
		 final Author author = new Author(authorCreateParameter.getSurname(), authorCreateParameter.getName(), 1, authorCreateParameter.getGender());

	        return author;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Author get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
