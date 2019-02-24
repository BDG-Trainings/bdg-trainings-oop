package com.bdg.bookstorage.ekirakosyan.service;

import com.bdg.bookstorage.ekirakosyan.common.*;
import com.bdg.bookstorage.ekirakosyan.entity.Author;
import com.bdg.bookstorage.ekirakosyan.entity.Book;

public class BookServiceImpl implements BookService {

    private AuthorService authorService;

    public BookServiceImpl(AuthorService authorService) {
        this.authorService = new AuthorServiceImpl();
    }

    @Override
    public Book get() {
        return null;
    }

    @Override
    public Book create(BookCreateParameter createParameter) {

        final Author[] authors = new Author[createParameter.getAuthorCreateParameters().length];
        int i = 0;
        for(AuthorCreateParameter p: createParameter.getAuthorCreateParameters()){
            authors[i] = this.authorService.create(p);
            i++;
        }

        final Book book = new Book(1, createParameter.getName(), createParameter.getPrice(), authors);

        return book;
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
