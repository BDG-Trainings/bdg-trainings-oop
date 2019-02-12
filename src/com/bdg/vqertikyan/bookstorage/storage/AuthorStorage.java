package com.bdg.vqertikyan.bookstorage.storage;

import com.bdg.vqertikyan.bookstorage.entities.Author;

public final class AuthorStorage extends AbstractAuthorStorage {

    private int currentStorageSize = 0;

    public AuthorStorage(int storageSize) {
        super(storageSize);
    }

    @Override
    public Author store(Author author) {
        currentStorageSize++;
        authorStore[currentStorageSize] = author;
        return author;
    }

    @Override
    public boolean remove(Author author) {
        currentStorageSize--;
        //Write code to Find author by id in storage
        return false;
    }

    @Override
    public Author get(int id) {
        //Write code to Find author by id in storage
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
