package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.common.AutorCreateParameter;
import com.bdg.bookstorage.ekirakosyan.entity.Author;

public interface AuthorService {

    Author get();
    Author create(AutorCreateParameter autorCreateParameter);
    Author update();
    boolean delete();
}
