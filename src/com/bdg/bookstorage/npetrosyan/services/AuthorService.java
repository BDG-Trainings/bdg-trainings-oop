package com.bdg.bookstorage.npetrosyan.services;

import com.bdg.bookstorage.npetrosyan.entity.Author;

public interface AuthorService {
    Author create();
    Author update();
    Author get ();
    boolean delete();
}
