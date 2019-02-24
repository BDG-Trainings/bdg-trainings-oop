package com.bdg.bookstorage.osahakyan.service;

import com.bdg.bookstorage.osahakyan.common.BookCreateParameters;
import com.bdg.bookstorage.osahakyan.common.BookUpdateParameters;
import com.bdg.bookstorage.osahakyan.entity.Book;

public interface BookService {

    Book create(BookCreateParameters bookCreateParameters);

    Book update(BookUpdateParameters bookUpdateParameters);

    BookCreateParameters delete();

    Book get();
}
