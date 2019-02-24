package com.bdg.bookstorage.warustamyan.service;

import com.bdg.bookstorage.warustamyan.common.BookCreateParameter;
import com.bdg.bookstorage.warustamyan.common.BookUpdateParameter;
import com.bdg.bookstorage.warustamyan.entity.Book;

public interface BookService {

    Book create(BookCreateParameter createParameter);

    Book update(BookUpdateParameter updateParameter);

    boolean delete();

    Book get();

}
