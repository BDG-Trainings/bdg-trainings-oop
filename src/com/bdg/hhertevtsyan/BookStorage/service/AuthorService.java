package com.bdg.hhertevtsyan.BookStorage.service;

import com.bdg.hhertevtsyan.BookStorage.entity.Author;
import com.bdg.hhertevtsyan.BookStorage.AuthorStorage;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.AuthorCreateParameter;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.AuthorUpdateParameter;

public class AuthorService extends AbstarctAuthorService {
    private AuthorStorage authorStorage;

    public AuthorService (final AuthorStorage authorStorage) {
        this.authorStorage = authorStorage;
    }
    @Override
    public Author get(final int id) {
       return authorStorage.get(id);
    }

    @Override
    public Author create(AuthorCreateParameter params) {
        Author newAuthor = new Author(params.getId(),params.getName(),params.getSurename(),params.getGender());
        return authorStorage.store(newAuthor);
    }

    @Override
    public Author update(AuthorUpdateParameter params) {

        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
