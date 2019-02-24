package com.bdg.bookstorage.aghazaryan.service;

import com.bdg.bookstorage.aghazaryan.entity.Book;

public interface BookService {

    Book create(BookCreateParameter createParameter);

    Book update();

    boolean delete();

    Book get();

}
