package com.bdg.bookstorage.vqertikyan.service;

import com.bdg.bookstorage.vqertikyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vqertikyan.common.BookCreateParameter;
import com.bdg.bookstorage.vqertikyan.common.BookUpdateParameter;
import com.bdg.bookstorage.vqertikyan.entity.Author;
import com.bdg.bookstorage.vqertikyan.entity.Book;

public class BookServiceImpl implements BookService{

    private AuthorService authorService;

    public BookServiceImpl() {
        this.authorService = new AuthorServiceImpl();
    }

    @Override
    public Book create(BookCreateParameter createParameter) {
        final Author[] authors = new Author[createParameter.getAuthorCreateParameters().length];

        int i = 0;
        for (AuthorCreateParameter p : createParameter.getAuthorCreateParameters()) {
            authors[i] = this.authorService.create(p);
            i++;
        }

        return new Book(1, createParameter.getName(), createParameter.getPrice(), authors);
    }

    @Override
    public Book update(BookUpdateParameter bookUpdateParameter) {
        return null;
    }

    @Override
    public Book delete() {
        return null;
    }

    @Override
    public Book get() {
        return null;
    }
}
