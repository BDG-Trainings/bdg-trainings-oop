package com.bdg.agalayan.BookStorage.Storage;

import com.bdg.agalayan.BookStorage.entity.Book;

public abstract class AbstractBookStorage extends Storage{
            protected Book[] bookStore;

        public AbstractBookStorage(int storageMaxSize, Book[]bookStore){
            super(storageMaxSize);
            this.bookStore= new Book[storageMaxSize];

        }

    public Book[] getBookStore() {
        return bookStore;
    }

    public void setBookStore(Book[] bookStore) {
        this.bookStore = bookStore;
    }

    public abstract Book store(Book book);

    public boolean remove(Book book) {
        return false;
    }

    public abstract Book get(int id);

    }





