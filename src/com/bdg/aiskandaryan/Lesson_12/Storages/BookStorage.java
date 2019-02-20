package com.bdg.aiskandaryan.Lesson_12.Storages;

import com.bdg.aiskandaryan.Lesson_12.Author;
import com.bdg.aiskandaryan.Lesson_12.Book;
import com.sun.deploy.util.ArrayUtil;


public class BookStorage extends AbstractBookStorage {

    public BookStorage(final int storageSize) {
        this.storageSize = storageSize;
        this.bookStore = new Book[storageSize];
    }

    @Override
    public Book store(final Book book) {
        Book [] newStorage = new Book[storageSize + 1];
        for (int i = 0; i < storageSize; i++) {
            newStorage[i] = bookStore[i];
        }
        newStorage[storageSize] = book;
        bookStore = newStorage;
        storageSize++;
        return book;
    }

    @Override
    public boolean remove(final Book book) {
        /*
        if (storageSize > 0 && book != null){
            Book [] newStorage = new Book[storageSize - 1];
            int deltaIndex = 0;
            for (int i = 0; i < storageSize; i++) {
                if (bookStore[i].getId() == book.getId()) {
                    deltaIndex = 1;
                }
                newStorage[i - deltaIndex] = bookStore[i];
            }
            if (deltaIndex != 0) {
                bookStore = newStorage;
                storageSize--;
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }*/
        Book [] newStorage;
        if (storageSize > 0 && book != null) {
            for (int i = 0; i < storageSize; i++) {
                if (bookStore[i].getId() == book.getId()) {
                    newStorage = new Book[storageSize - 1];
                    for (int k = 0; k < i; k++) {
                        newStorage[k] = bookStore[k];
                    }
                    for (int l = i; l < bookStore.length - 1; l++) {
                        newStorage[l] = bookStore[l + 1];
                    }
                    bookStore = newStorage;
                    storageSize--;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public Book get(final int id) {
        for (int i = 0; i < storageSize; i++) {
            if (bookStore[i].getId() == id) {
                return bookStore[i];
            }
        }
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return storageSize;
    }
}
