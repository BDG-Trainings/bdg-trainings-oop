package com.bdg.bookstorage.hhertevtsyan.service;

import com.bdg.bookstorage.hhertevtsyan.common.BookCreateParameter;
import com.bdg.bookstorage.hhertevtsyan.common.BookUpdateParameter;
import com.bdg.bookstorage.hhertevtsyan.entity.Book;

public interface BookService{
    Book get();

    Book create(BookCreateParameter createParameter);

    Book update(BookUpdateParameter updateParameter);

    boolean delete();
}
