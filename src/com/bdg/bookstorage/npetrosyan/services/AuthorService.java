package com.bdg.bookstorage.npetrosyan.services;

import com.bdg.bookstorage.npetrosyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.npetrosyan.entity.Author;

public interface AuthorService {
    Author create(AuthorCreateParameter createParameter);
    Author update();
    Author get ();
    boolean delete();
}
