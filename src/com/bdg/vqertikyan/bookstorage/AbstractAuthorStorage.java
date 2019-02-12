package com.bdg.vqertikyan.bookstorage;

public abstract class AbstractAuthorStorage {
    protected Author authorStore;

    public abstract Author store(Author author);
    public abstract boolean remove(Author author);
    public abstract Author get(int id);
}
