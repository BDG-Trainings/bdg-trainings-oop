package com.bdg.bookstorage.osahakyan.service;

import com.bdg.bookstorage.osahakyan.common.AuthorCreateParameters;
import com.bdg.bookstorage.osahakyan.entity.Author;

public interface AuthorService {

    AuthorCreateParameters create();

    AuthorCreateParameters update();

    boolean delete();

    AuthorCreateParameters get();
}
