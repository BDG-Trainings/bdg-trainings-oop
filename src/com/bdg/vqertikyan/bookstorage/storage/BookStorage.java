package com.bdg.vqertikyan.bookstorage.storage;

import com.bdg.vqertikyan.bookstorage.entities.Book;

public final class BookStorage extends AbstractBookStorage {

    private int currentStorageSize = 0;

    public BookStorage(int storageSize) {
        super(storageSize);
    }

    @Override
    public Book store(Book book) {
        currentStorageSize++;
        bookStore[currentStorageSize] = book;
        return book;
    }

    @Override
    public boolean remove(Book book) {
        currentStorageSize--;
        //Write code to Find book by id in storage
        return false;
    }

    @Override
    public Book get(int id) {
        //Write code to Find book by id in storage
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
