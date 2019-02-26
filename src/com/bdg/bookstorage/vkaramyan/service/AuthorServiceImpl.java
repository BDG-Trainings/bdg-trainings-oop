package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.vkaramyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vkaramyan.entity.Author;

public class AuthorServiceImpl implements AuthorService{

	@Override
	public Author create(final AuthorCreateParameter createParameter) {
		 final Author author = new Author(createParameter.getSurname(), createParameter.getName(), 1, createParameter.getGender());

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
