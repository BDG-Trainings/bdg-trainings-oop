package com.bdg.bookstorage.vqertikyan.service;

import com.bdg.bookstorage.vqertikyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vqertikyan.entity.Author;

public interface AuthorService {

    Author create(AuthorCreateParameter authorCreateParameter);

    Author delete();

    Author get();
}
