package com.bdg.bookstorage.warustamyan.service;

import com.bdg.bookstorage.warustamyan.entity.Book;

public interface BookService {

    Book create();

    Book update();

    boolean delete();

    Book get();

}
