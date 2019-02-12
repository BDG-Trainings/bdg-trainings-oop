package com.bdg.spapoyan.BookStorage.Services;

import com.bdg.spapoyan.BookStorage.Author;
import com.bdg.spapoyan.BookStorage.AuthorCreateParameter;
import com.bdg.spapoyan.BookStorage.BookUpdateParameter;
import com.bdg.spapoyan.BookStorage.Storage.AuthorStorage;

public class AuthorService extends AbstractAuthorService {

    private AuthorStorage authorStorage;

    public AuthorService(AuthorStorage storage) {
        this.authorStorage = storage;
    }


    @Override
    public Author get(int id) {
        return null;
    }

    @Override
    public Author create(AuthorCreateParameter params) {
        return null;
    }

    @Override
    public Author update(BookUpdateParameter params) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
