package com.bdg.vqertikyan.bookstorage.services;

import com.bdg.vqertikyan.bookstorage.createupdateobjects.BookCreateParameters;
import com.bdg.vqertikyan.bookstorage.createupdateobjects.BookUpdateParameters;
import com.bdg.vqertikyan.bookstorage.entities.Book;

public abstract class AbstractBookService {

    public abstract Book get(int id);
    public abstract Book create(BookCreateParameters params);
    public abstract Book update(BookUpdateParameters params);
    public abstract boolean delete(int id);

}
