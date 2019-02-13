package com.bdg.osahakyan.bookstore.storage;

import com.bdg.osahakyan.bookstore.entities.Book;

public abstract class AbstractBookStorage {

    protected Book bookStore;

    public abstract Book store(Book book);
    public abstract boolean remove(Book book);
    public abstract Book get(int id);
}
