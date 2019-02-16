package com.bdg.vkaramyan.storage;

import com.bdg.vkaramyan.entitys.Author;

public class AuthorStorage extends AbstractAuthorStorage {
	
	private int currentStorageSize = 0;

	
	public AuthorStorage(int currentStorageSize) {
		super();
		this.currentStorageSize = currentStorageSize;
	}

	@Override
	public Author store(Author author) {
		currentStorageSize++;
        AuthorStore[currentStorageSize] = author;
        return author;
	}

	@Override
	public boolean remove(Author author) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Author get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCurrentStorageSize() {
		return currentStorageSize;
	}
	
	

}
