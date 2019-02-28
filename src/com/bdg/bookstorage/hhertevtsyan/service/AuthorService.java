package com.bdg.bookstorage.hhertevtsyan.service;


import com.bdg.bookstorage.hhertevtsyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.hhertevtsyan.entity.Author;

public interface AuthorService {
    Author get();

    Author create(AuthorCreateParameter createParameter);

    boolean delete();
}
