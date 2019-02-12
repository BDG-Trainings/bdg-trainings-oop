package com.bdg.vqertikyan.bookstorage.services;


import com.bdg.vqertikyan.bookstorage.createupdateobjects.AuthorCreateParameters;
import com.bdg.vqertikyan.bookstorage.createupdateobjects.AuthorUpdateParameters;
import com.bdg.vqertikyan.bookstorage.entities.Author;
import com.bdg.vqertikyan.bookstorage.storage.AuthorStorage;

public final class AuthorService extends AbstractAuthorService {

    private AuthorStorage authorStorage;

    public AuthorService() {
    }

    public AuthorService(AuthorStorage authorStorage) {
        this.authorStorage = authorStorage;
    }

    @Override
    public Author get(int id) {
        return null;
    }

    @Override
    public Author create(AuthorCreateParameters params) {
        return null;
    }

    @Override
    public Author update(AuthorUpdateParameters params) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
