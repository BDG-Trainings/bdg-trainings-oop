package com.bdg.bookstorage.osahakyan.service;

import com.bdg.bookstorage.osahakyan.common.BookCreateParameters;
import com.bdg.bookstorage.osahakyan.entity.Book;

public interface BookService {

    BookCreateParameters create();

    BookCreateParameters update();

    BookCreateParameters delete();

    Book get();
}
