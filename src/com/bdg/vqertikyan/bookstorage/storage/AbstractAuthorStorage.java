package com.bdg.vqertikyan.bookstorage.storage;

import com.bdg.vqertikyan.bookstorage.entities.Author;

public abstract class AbstractAuthorStorage extends Storage {
    protected Author[] authorStore;

    protected AbstractAuthorStorage(int storageSize) {
        super(storageSize);
    }

    public abstract Author store(Author author);
    public abstract boolean remove(Author author);
    public abstract Author get(int id);
}
