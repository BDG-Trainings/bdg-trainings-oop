package com.bdg.akarapetyan.book_storage.services;

import com.bdg.akarapetyan.book_storage.create_update_objects.BookCreateParameter;
import com.bdg.akarapetyan.book_storage.create_update_objects.BookUpdateParameter;
import com.bdg.akarapetyan.book_storage.entitys.Book;

public abstract class AbstractBookService {

    public abstract Book get (int id);

    public abstract Book create (BookCreateParameter params);

    public abstract Book update (BookUpdateParameter params);

    public abstract boolean delete (int id);

}
