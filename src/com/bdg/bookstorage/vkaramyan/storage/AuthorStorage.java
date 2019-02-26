package com.bdg.bookstorage.vkaramyan.storage;

import com.bdg.bookstorage.vkaramyan.entity.Author;

public interface AuthorStorage {
	
	Author authorStore();
	
	Author store();
	boolean remove();
	Author get();

}
