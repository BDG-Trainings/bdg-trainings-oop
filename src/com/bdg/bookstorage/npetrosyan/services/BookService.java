package com.bdg.bookstorage.npetrosyan.services;

import com.bdg.bookstorage.npetrosyan.entity.Book;

public interface BookService {
    Book create();

    Book update();

    boolean delete();

    Book get();
}
