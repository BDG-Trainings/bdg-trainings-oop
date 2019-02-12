package com.bdg.vqertikyan.bookstorage.storage;

import com.bdg.vqertikyan.bookstorage.entities.Book;

public abstract class AbstractBookStorage extends Storage{
    protected Book[] bookStore;

    public AbstractBookStorage(int storageSize) {
        super(storageSize);
    }

    public abstract Book store(Book book);
    public abstract boolean remove(Book book);
    public abstract Book get(int id);

}
