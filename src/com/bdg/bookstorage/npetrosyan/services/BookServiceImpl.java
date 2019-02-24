package com.bdg.bookstorage.npetrosyan.services;

import com.bdg.bookstorage.npetrosyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.npetrosyan.common.BookCreateParameter;
import com.bdg.bookstorage.npetrosyan.common.BookUpdateParameter;
import com.bdg.bookstorage.npetrosyan.entity.Author;
import com.bdg.bookstorage.npetrosyan.entity.Book;
import com.bdg.bookstorage.npetrosyan.services.AuthorService;
import com.bdg.bookstorage.npetrosyan.services.AuthorServiceImpl;
import com.bdg.bookstorage.npetrosyan.services.BookService;

public class BookServiceImpl implements BookService {

    private AuthorService authorService;

    public BookServiceImpl() {
        this.authorService = new AuthorServiceImpl();
    }



    public Book create(final BookCreateParameter createParameter) {

        final Author[] authors = new Author[createParameter.getAuthorCreateParameters().length];

        int i = 0;
        for (AuthorCreateParameter p : createParameter.getAuthorCreateParameters()) {
            authors[i] = this.authorService.create(p);
            i++;
        }


        final Book book = new Book(1, createParameter.getName(), createParameter.getTitle(), createParameter.getPrice(), authors);


        return null;
    }


    public Book update(final BookUpdateParameter updateParameter) {
        return null;
    }

    @Override
    public Book create() {
        return null;
    }

    @Override
    public Book update() {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public Book get() {
        return null;
    }
}
