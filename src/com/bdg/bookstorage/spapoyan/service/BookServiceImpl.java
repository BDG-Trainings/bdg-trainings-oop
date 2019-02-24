package com.bdg.bookstorage.spapoyan.service;

import com.bdg.bookstorage.spapoyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.spapoyan.common.BookCreateParameter;
import com.bdg.bookstorage.spapoyan.common.BookUpdateParameter;
import com.bdg.bookstorage.spapoyan.entitys.Author;
import com.bdg.bookstorage.spapoyan.entitys.Book;

public class BookServiceImpl implements BookService {

    private AuthorService authorService;

    public BookServiceImpl() {
        //this.authorService = new AuthorServiceImpl();
    }

    @Override
    public Book get() {
        return null;
    }

    @Override
    public Book create(final BookCreateParameter bookCreateParameter) {

        final Author [] authors = new Author[bookCreateParameter.getAuthorCreateParameters().length];

        int i = 0;

        for (AuthorCreateParameter p: bookCreateParameter.getAuthorCreateParameters()){
            authors[i] = this.authorService.create(p);
            i++;
        }

        final Book book = new Book(1, bookCreateParameter.getName(), bookCreateParameter.getPrice(), authors);

        return null;
    }

    @Override
    public Book update(BookUpdateParameter bookUpdateParameter) {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
