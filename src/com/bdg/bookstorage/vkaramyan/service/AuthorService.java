package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.vkaramyan.entity.Author;

public interface AuthorService {
	
	Author create();
	Author update();
	boolean delete();
	Author get();

}
