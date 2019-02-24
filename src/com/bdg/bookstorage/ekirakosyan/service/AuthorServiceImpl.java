package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.common.AutorCreateParameter;
import com.bdg.bookstorage.ekirakosyan.entity.Author;

public class AuthorServiceImpl implements AuthorService{


    @Override
    public Author create(AutorCreateParameter createParameter) {
        Author author = new Author(1, createParameter.getName(), createParameter.getSurname(), createParameter.getGender());
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
