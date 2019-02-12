package com.bdg.spapoyan.BookStorage.Storage;

import com.bdg.spapoyan.BookStorage.Book;

public abstract class AbstractBookStorage extends Storage {

    protected Book bookStore;

    protected AbstractBookStorage(int storageSize) {
        super(storageSize);
    }



    public abstract Book store(Book book);
    public abstract boolean remove(Book book);
    public abstract Book get(int id);
}
