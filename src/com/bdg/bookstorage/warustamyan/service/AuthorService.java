package com.bdg.bookstorage.warustamyan.service;

import com.bdg.bookstorage.warustamyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.warustamyan.entity.Author;

public interface AuthorService {

    Author create(AuthorCreateParameter createParameter);

    Author get();

    boolean delete();

    Author update();
}
