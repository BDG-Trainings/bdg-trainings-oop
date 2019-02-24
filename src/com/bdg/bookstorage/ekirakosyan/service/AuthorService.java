package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.entity.Author;

public interface AuthorService {

    Author get();
    Author create();
    Author update();
    boolean delete();
}
