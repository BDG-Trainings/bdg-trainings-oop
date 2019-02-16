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
        Book [] bookstore1 = new Book[bookStore.length+1];
        for (int i=0; i< bookStore.length; i++){
            bookstore1[i]=bookStore[i];
        }
        bookstore1[bookStore.length] = book;
        bookStore = bookstore1;
        return book;
    }

    @Override
    public boolean remove(Book book) {
        if (get(book.getId()) != null){



        }
        return false;
    }

    @Override
    public Book get(int id) {
        Book book = null;
        for (int i=0; i< bookStore.length; i++){
            if (bookStore[i].getId() == id) {
                book = bookStore[i];
                break;
            }
        }
        return book;
    }

    public int getCurrentStorageSize() {
        return size;
    }
}
