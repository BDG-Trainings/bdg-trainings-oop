package com.bdg.spapoyan.BookStorage.Storage;

import com.bdg.spapoyan.BookStorage.Author;

public class AuthorStorage extends AbstrctAuthorStorage {

    private int currentStorageSize;

    public AuthorStorage(int storageSize) {
        super(storageSize);

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

