package com.bdg.osahakyan.bookstore.storage;

import com.bdg.osahakyan.bookstore.entities.Author;

public abstract class AbstractAuthorStorage {

    protected Author authorStorage;

    public abstract Author store(Author book);
    public abstract boolean remove(Author book);
    public abstract Author get(int id);

}
