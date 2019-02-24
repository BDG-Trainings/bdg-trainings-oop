package com.bdg.bookstorage.osahakyan.service;

import com.bdg.bookstorage.osahakyan.common.AuthorCreateParameters;
import com.bdg.bookstorage.osahakyan.entity.Author;

public interface AuthorService {

    Author create(AuthorCreateParameters authorCreateParameters);

    Author update();

    boolean delete();

    Author get();
}
