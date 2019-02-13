package com.bdg.osahakyan.bookstore.services;


import com.bdg.osahakyan.bookstore.createupdateobjects.BookCreateParameters;
import com.bdg.osahakyan.bookstore.createupdateobjects.BookUpdateParameters;
import com.bdg.osahakyan.bookstore.entities.Book;

public abstract class AbstractBookService {

    public abstract Book get(final int id);
    public abstract Book create(final BookCreateParameters params);
    public abstract Book update(final BookUpdateParameters params);
    public abstract boolean delete(final int id);

}
