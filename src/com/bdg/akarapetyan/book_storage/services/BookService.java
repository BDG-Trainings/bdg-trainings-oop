package com.bdg.akarapetyan.book_storage.services;

import com.bdg.akarapetyan.book_storage.create_update_objects.BookCreateParameter;
import com.bdg.akarapetyan.book_storage.create_update_objects.BookUpdateParameter;
import com.bdg.akarapetyan.book_storage.entitys.Book;
import com.bdg.akarapetyan.book_storage.storage.BookStorage;

public class BookService extends AbstractBookService {

    private BookStorage storage;

    private AuthorService authorService = new AuthorService();

    public BookService(BookStorage storage) {
        this.storage = storage;
    }

    @Override
    public Book get(int id) {
        return storage.get(id);
    }

    @Override
    public Book create(BookCreateParameter params) {
        return null;
    }

    @Override
    public Book update(BookUpdateParameter params) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
