package com.bdg.bookstorage.aghazaryan.service;

import com.bdg.bookstorage.aghazaryan.common.BookCreateParameter;
import com.bdg.bookstorage.aghazaryan.entity.Book;

public interface BookService {

    Book create(BookCreateParameter createParameter);

    Book update(BookUpdateParameter createParameter);

    boolean delete();

    Book get();

}
