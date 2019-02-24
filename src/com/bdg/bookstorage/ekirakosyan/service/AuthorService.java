package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.entity.Author;
import com.bdg.bookstorage.npetrosyan.createUpdateProject.AuthorCreateParameter;

public interface AuthorService {

    Author get();
    Author create(AuthorCreateParameter authorCreateParameter );
    Author update();
    boolean delete();
}
