package com.bdg.bookstorage.vqertikyan.service;

import com.bdg.bookstorage.vqertikyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vqertikyan.entity.Author;

public class AuthorServiceImpl implements AuthorService{

    @Override
    public Author create(AuthorCreateParameter authorCreateParameter) {
        return new Author(1, authorCreateParameter.getName(), authorCreateParameter.getSurName(), authorCreateParameter.getGender());
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
