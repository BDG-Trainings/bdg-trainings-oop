package com.bdg.spapoyan.BookStorage.Storage;

import com.bdg.spapoyan.BookStorage.Author;

public abstract class AbstrctAuthorStorage extends Storage {

    public AbstrctAuthorStorage(int storageSize) {
        super(storageSize);
    }

    protected Author [] authorStore;

    public abstract Author store(Author author);
    public abstract boolean remove(Author author);
    public abstract Author get(int id);
}
