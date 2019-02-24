package com.bdg.bookstorage.spapoyan.service;

import com.bdg.bookstorage.spapoyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.spapoyan.entitys.Author;

public interface AuthorService {

    Author get();

    Author create(AuthorCreateParameter authorCreateParameter);

    boolean delete();



}
