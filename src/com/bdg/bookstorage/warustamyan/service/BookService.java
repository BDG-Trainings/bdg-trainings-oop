package com.bdg.bookstorage.warustamyan.service;

import com.bdg.bookstorage.warustamyan.common.BookCreateParameter;
import com.bdg.bookstorage.warustamyan.entity.Book;

public interface BookService {

    Book create(BookCreateParameter createParameter);

    Book update();

    boolean delete();

    Book get();

}
