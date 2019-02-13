package com.bdg.hhertevtsyan.BookStorage.services;

import com.bdg.hhertevtsyan.BookStorage.Book;
import com.bdg.hhertevtsyan.BookStorage.BookStorage;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.BookCreateParameter;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.BookUpdateParameter;

public class BookService extends AbstractBookService {
    private BookStorage bookStorage;
    private AuthorService authorService;

    @Override
    public Book get(int id) {
       // Book [] newBookStorage = new Book[];
        return null;
    }

    @Override
    public Book create(BookCreateParameter params) {
        return null;
    }

    @Override
    public Book update(BookUpdateParameter params) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
