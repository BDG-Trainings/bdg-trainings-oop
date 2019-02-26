package com.bdg.agalayan.BookStorage.service;

import com.bdg.agalayan.BookStorage.common.AuthorCreateParameter;
import com.bdg.agalayan.BookStorage.entity.Author;

public interface AuthorService {

    Author get(int id);

    Author create(AuthorCreateParameter authorCreateParameter);

    boolean delete(int id);
}
