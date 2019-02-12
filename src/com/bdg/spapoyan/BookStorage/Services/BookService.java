package com.bdg.spapoyan.BookStorage.Services;

import com.bdg.spapoyan.BookStorage.Book;
import com.bdg.spapoyan.BookStorage.BookCreateParameter;
import com.bdg.spapoyan.BookStorage.BookUpdateParameter;
import com.bdg.spapoyan.BookStorage.Storage.BookStorage;

public class BookService extends AbstractBookService {

    private BookStorage bookStorage;
    private AuthorService authorService;

    public BookService(BookStorage storage, AuthorService service) {
        this.bookStorage = storage;
        this.authorService = service;
    }

    public Book get(int id) {
        return null;
    }

    public Book create(BookCreateParameter params) {
        return null;
    }

    public Book update(BookUpdateParameter params) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }
}
