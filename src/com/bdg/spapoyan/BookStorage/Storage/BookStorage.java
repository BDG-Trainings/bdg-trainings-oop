package com.bdg.spapoyan.BookStorage.Storage;

import com.bdg.spapoyan.BookStorage.Book;

public class BookStorage extends AbstractBookStorage {

    private int currentStorageSize;


    public BookStorage(int storageSize) {
        super(storageSize);
    }

    @Override
    public Book store(Book book) {
        return null;
    }

    @Override
    public boolean remove(Book book) {
        return false;
    }

    @Override
    public Book get(int id) {
        return null;
    }

}
