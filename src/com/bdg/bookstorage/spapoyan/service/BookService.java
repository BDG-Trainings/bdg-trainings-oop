package com.bdg.bookstorage.spapoyan.service;

import com.bdg.bookstorage.spapoyan.common.BookCreateParameter;
import com.bdg.bookstorage.spapoyan.common.BookUpdateParameter;
import com.bdg.bookstorage.spapoyan.entitys.Book;

public interface BookService {

    Book get();

    Book create(BookCreateParameter bookCreateParameter);

    Book update(BookUpdateParameter bookUpdateParameter);

    boolean delete();

}
