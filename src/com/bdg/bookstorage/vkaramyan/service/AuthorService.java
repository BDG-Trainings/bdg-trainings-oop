package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.vkaramyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vkaramyan.entity.Author;

public interface AuthorService {
	
	Author create(AuthorCreateParameter authorCreateParameter);
	Author update();
	boolean delete();
	Author get();

}
