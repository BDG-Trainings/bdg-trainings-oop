package com.bdg.bookstorage.spapoyan.service;

import com.bdg.bookstorage.spapoyan.entitys.Book;

public interface BookService {

    Book get();

    Book create();

    Book update();

    boolean delete();

}
