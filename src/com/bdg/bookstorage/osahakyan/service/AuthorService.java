package com.bdg.bookstorage.osahakyan.service;

import com.bdg.bookstorage.osahakyan.entity.Author;

public interface AuthorService {

    Author create();

    Author update();

    boolean delete();

    Author get();
}
