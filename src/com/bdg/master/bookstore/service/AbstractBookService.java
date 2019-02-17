package com.bdg.master.bookstore.service;


import com.bdg.master.bookstore.book.Book;
import com.bdg.master.bookstore.parameters.BookCreateParameters;
import com.bdg.master.bookstore.parameters.BookEditParameters;

public abstract class AbstractBookService {

    public abstract Book create(BookCreateParameters parameters);

    public abstract Book edit(BookEditParameters parameters);
}
