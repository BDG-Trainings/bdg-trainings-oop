package com.bdg.akarapetyan.book_storage.storage;

import com.bdg.akarapetyan.book_storage.entitys.Author;

public class AuthorStorage extends AbstractAuthorStorage{

    private int currentStorage;

    public AuthorStorage(int currentStorage) {
        this.currentStorage = currentStorage;
    }

    @Override
    public Author store(Author author) {
        return null;
    }

    @Override
    public boolean remove(Author author) {
        return false;
    }

    @Override
    public Author get(int id) {
        return null;
    }
}
