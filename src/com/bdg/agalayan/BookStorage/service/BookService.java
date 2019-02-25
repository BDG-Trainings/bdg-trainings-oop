package com.bdg.agalayan.BookStorage.service;

import com.bdg.agalayan.BookStorage.common.BookCreateParameter;
import com.bdg.agalayan.BookStorage.common.BookUpdateParameter;
import com.bdg.agalayan.BookStorage.entity.Book;

public interface BookService {

    Book get(int id);

    Book create(BookCreateParameter bookCreateParameter);

    Book update(BookUpdateParameter bookUpdateParameter);

    Book delete(int id);
}
