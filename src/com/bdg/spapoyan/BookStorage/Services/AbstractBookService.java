package com.bdg.spapoyan.BookStorage.Services;

import com.bdg.spapoyan.BookStorage.Book;
import com.bdg.spapoyan.BookStorage.BookCreateParameter;
import com.bdg.spapoyan.BookStorage.BookUpdateParameter;

public abstract class AbstractBookService {

    public abstract Book get(int id);
    public abstract Book create(BookCreateParameter params);
    public abstract Book update(BookUpdateParameter params);
    public abstract boolean delete(int id);
}
