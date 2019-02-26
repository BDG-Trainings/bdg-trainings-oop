package com.bdg.bookstorage.aghazaryan.service;

import com.bdg.bookstorage.aghazaryan.common.AuthorCreateParameter;
import com.bdg.bookstorage.aghazaryan.entity.Author;
import com.bdg.bookstorage.aghazaryan.storage.AuthorStorage;

public class AuthorServiceImpl implements AuthorService {

    private AuthorStorage authorStorage;

    public AuthorServiceImpl() {
        this.authorStorage = new AuthorStorage(3);

    }

    @Override
    public Author create(final AuthorCreateParameter createParameter) {

        final Author author = new Author(1, createParameter.getName(), createParameter.getSurname(), createParameter.getGender());

        return author;
    }

    @Override
    public Author delete() {
        return null;
    }

    @Override
    public Author get() {
        return null;
    }
}

