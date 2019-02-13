package com.bdg.akarapetyan.book_storage.storage;

import com.bdg.akarapetyan.book_storage.entitys.Book;

public class BookStorage extends AbstractBookStorage{

    private int currentStorageSize;

    public BookStorage(int currentStorageSize) {
        this.currentStorageSize = currentStorageSize;
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

    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
