package com.bdg.bookstorage.aghazaryan.service;

import com.bdg.bookstorage.aghazaryan.common.AuthorCreateParameter;
import com.bdg.bookstorage.aghazaryan.common.BookCreateParameter;
import com.bdg.bookstorage.aghazaryan.common.BookUpdateParameter;
import com.bdg.bookstorage.aghazaryan.entity.Author;
import com.bdg.bookstorage.aghazaryan.entity.Book;
import com.bdg.bookstorage.aghazaryan.storage.BookStorage;

public class BookServiceImpl implements BookService {

    private BookStorage bookStorage;
    private AuthorService authorService;

    public BookServiceImpl() {
        this.authorService = new AuthorServiceImpl();
        this.bookStorage= new BookStorage(5);
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

