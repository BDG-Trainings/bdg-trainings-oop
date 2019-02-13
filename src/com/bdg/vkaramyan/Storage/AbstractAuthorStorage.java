package com.bdg.vkaramyan.Storage;

import com.bdg.vkaramyan.entitys.Author;


public abstract class AbstractAuthorStorage extends Storage{
	

	protected Author authorStore;

	public AbstractAuthorStorage(int size, Author authorStore) {
		super(size);
		this.authorStore = authorStore;
	}
	
	 public abstract Author store(Author author);
	 public abstract boolean remove(Author author);
	 public abstract Author get(int id);

}
