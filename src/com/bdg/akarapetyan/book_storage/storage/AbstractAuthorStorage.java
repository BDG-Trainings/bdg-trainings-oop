package com.bdg.akarapetyan.book_storage.storage;

import com.bdg.akarapetyan.book_storage.entitys.Author;

public abstract class AbstractAuthorStorage {

    protected Author authorStore;

    public abstract Author store (Author author);

    public abstract boolean remove (Author author);

    public abstract Author get (int id);
}
