package com.bdg.aiskandaryan.Lesson_12.Storages;

import com.bdg.aiskandaryan.Lesson_12.Author;
import com.bdg.aiskandaryan.Lesson_12.Book;

public class BookStorage extends AbstractBookStorage {

    private int currentStorageSize;

    public BookStorage(final int storageSize) {
        this.currentStorageSize = storageSize;
        this.bookStore = new Book[currentStorageSize];
    }

    @Override
    public Book store(final Book book) {
        Book [] newStorage = new Book[currentStorageSize + 1];
        for (int i = 0; i < currentStorageSize; i++) {
            newStorage[i] = bookStore[i];
        }
        newStorage[currentStorageSize] = book;
        bookStore = newStorage;
        currentStorageSize++;
        return book;
    }

    @Override
    public boolean remove(final Book book) {
        if (currentStorageSize > 0){
            Book [] newStorage = new Book[currentStorageSize - 1];
            int deltaIndex = 0;
            for (int i = 0; i < currentStorageSize; i++) {
                if (bookStore[i + deltaIndex].getId() == book.getId()) {
                    deltaIndex = 1;
                }
                newStorage[i] = bookStore[i + deltaIndex];
            }
            if (deltaIndex != 0) {
                bookStore = newStorage;
                currentStorageSize--;
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Book get(final int id) {
        for (int i = 0; i < currentStorageSize; i++) {
            if (bookStore[i].getId() == id) {
                return bookStore[i];
            }
        }
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
