package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.entity.Book;

public interface BookService {

    Book get();
    Book create();
    Book update();
    boolean delete();

}
