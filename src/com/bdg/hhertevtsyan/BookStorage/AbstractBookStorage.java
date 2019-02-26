package com.bdg.hhertevtsyan.BookStorage;

import com.bdg.hhertevtsyan.BookStorage.entity.Book;

public abstract class AbstractBookStorage extends Storage {
    protected Book[] bookStore;

    protected AbstractBookStorage(int storageSize) {
        super(storageSize);
    }

    public abstract Book store (final Book book);

    public abstract boolean remove (final Book book);

    public abstract Book get (final int id);
}

