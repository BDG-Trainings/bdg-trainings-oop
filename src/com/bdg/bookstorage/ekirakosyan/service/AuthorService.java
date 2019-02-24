package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.ekirakosyan.entity.Author;

public interface AuthorService {

    Author create(AuthorCreateParameter createParameter);

    Author get();

    boolean delete();
}
