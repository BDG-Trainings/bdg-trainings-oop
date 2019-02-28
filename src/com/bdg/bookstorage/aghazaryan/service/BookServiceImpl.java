package com.bdg.bookstorage.aghazaryan.service;

import com.bdg.bookstorage.aghazaryan.common.AuthorCreateParameter;
import com.bdg.bookstorage.aghazaryan.common.BookCreateParameter;
import com.bdg.bookstorage.aghazaryan.common.BookUpdateParameter;
import com.bdg.bookstorage.aghazaryan.entity.Author;
import com.bdg.bookstorage.aghazaryan.entity.Book;

public class BookServiceImpl implements BookService {


    private AuthorService authorService;

    public BookServiceImpl() {
        this.authorService = new AuthorServiceImpl();
    }


    @Override
    public Book create(final BookCreateParameter createParameter) {

        final Author[] authors = new Author[createParameter.getAuthorCreateParameters().length];

        int i = 0;
        for (AuthorCreateParameter p : createParameter.getAuthorCreateParameters()) {
            authors[i] = this.authorService.create(p);
            i++;
        }


        final Book book = new Book(1, createParameter.getName(), createParameter.getPrice(), authors);


        return null;
    }

    @Override
    public Book update(final BookUpdateParameter updateParameter) {

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

