package com.bdg.akarapetyan.book_storage.storage;

import com.bdg.akarapetyan.book_storage.entitys.Author;
import com.bdg.akarapetyan.book_storage.entitys.Book;

public class BookStorage extends AbstractBookStorage{

    public BookStorage(int storageSize, Book[] books) {
        super(storageSize, books);
        this.size = storageSize;
        this.bookStore = new Book[storageSize];
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
        return size;
    }
}
