package com.bdg.agalayan.BookStorage.Storage;

import com.bdg.agalayan.BookStorage.entity.Book;

public final class BookStorage extends AbstractBookStorage {
    private int currentStorageSize = 0;



    public BookStorage(int StorageSize, Book[] books) {
        super(StorageSize, books);

    }

    public void setCurrentStorageSize(int currentStorageSize) {
        this.currentStorageSize = currentStorageSize;
    }

    public int getCurrentStorageSize() {
        return currentStorageSize;
    }

    @Override
    public Book store(Book book) {
        if (currentStorageSize < bookStore.length) {
            bookStore[currentStorageSize] = book;
            currentStorageSize++;

        }
        return book;
    }


    @Override
    public Book get(int id) {
        for (int i = 0; i < currentStorageSize; i++) {
            if (bookStore[i].getId() == id) {
                return bookStore[i];
            }
        }
        return null;
    }

    @Override
    public boolean remove(Book book) {
        if (currentStorageSize < bookStore.length) {
            bookStore[currentStorageSize] = book;
            currentStorageSize--;


        }return true;
    }
}