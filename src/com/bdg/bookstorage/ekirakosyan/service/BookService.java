package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.common.BookCreateParameter;
import com.bdg.bookstorage.ekirakosyan.entity.Book;

public interface BookService {

    Book get();
    Book create(BookCreateParameter bookCreateParameter);
    Book update();
    boolean delete();

}
