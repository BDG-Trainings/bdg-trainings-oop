package com.bdg.bookstorage.hhertevtsyan.service;

import com.bdg.bookstorage.hhertevtsyan.common.BookCreateParameter;
import com.bdg.bookstorage.hhertevtsyan.common.BookUpdateParameter;
import com.bdg.bookstorage.hhertevtsyan.entity.Book;

public class BookServiceImpl implements BookService {

    private AuthorService authorService;


    public BookServiceImpl() {
        this.authorService = new AuthorServiceImpl();
    }

    @Override
    public Book get() {
        return null;
    }

    @Override
    public Book create(BookCreateParameter createParameter) {
        return null;
    }

    @Override
    public Book update(BookUpdateParameter updateParameter) {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
