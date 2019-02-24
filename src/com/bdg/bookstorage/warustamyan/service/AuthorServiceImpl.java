package com.bdg.bookstorage.warustamyan.service;

import com.bdg.bookstorage.warustamyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.warustamyan.entity.Author;

public class AuthorServiceImpl implements AuthorService {

    @Override
    public Author create(final AuthorCreateParameter createParameter) {

        final Author author = new Author(1, createParameter.getName(), createParameter.getSurname(), createParameter.getGender());

        return author;
    }

    @Override
    public Author get() {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
