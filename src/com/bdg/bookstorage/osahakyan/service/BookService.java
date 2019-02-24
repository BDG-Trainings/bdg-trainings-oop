package com.bdg.bookstorage.osahakyan.service;

import com.bdg.bookstorage.osahakyan.entity.Book;

public interface BookService {

    Book create();

    Book update();

    boolean delete();

    Book get();
}
