package com.bdg.hhertevtsyan.BookStorage;

import com.bdg.hhertevtsyan.BookStorage.entity.Author;

public abstract class AbstractAuthorStorage extends Storage {
    protected Author[] authorStore;
    protected AbstractAuthorStorage(int storageSize) {
        super(storageSize);
    }

    public abstract Author store (final Author author);
    public abstract boolean remove (final Author author);
    public abstract Author get (final int id);
}
