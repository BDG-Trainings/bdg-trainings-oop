package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.common.BookCreateParameter;
import com.bdg.bookstorage.ekirakosyan.common.BookUpdateParameter;
import com.bdg.bookstorage.ekirakosyan.entity.Book;

public class BookServiceImpl implements BookService {

    private AuthorService authorService;

    public BookServiceImpl(AuthorService authorService) {
        this.authorService = authorService;
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
