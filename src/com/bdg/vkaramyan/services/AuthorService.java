package com.bdg.vkaramyan.services;

import com.bdg.vkaramyan.createUpdateObject.AuthorCreateParameter;
import com.bdg.vkaramyan.createUpdateObject.BookUpdateParameter;
import com.bdg.vkaramyan.entitys.Author;
import com.bdg.vkaramyan.storage.AuthorStorage;

public class AuthorService extends AbstractAuthorService {
	
	private AuthorStorage authorStorage;

	public AuthorService(AuthorStorage authorStorage) {
		super();
		this.authorStorage = authorStorage;
	}

	@Override
	public Author get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author create(AuthorCreateParameter params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author update(BookUpdateParameter params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
