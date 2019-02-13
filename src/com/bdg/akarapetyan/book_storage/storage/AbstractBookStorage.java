package com.bdg.akarapetyan.book_storage.storage;

import com.bdg.akarapetyan.book_storage.entitys.Book;

public abstract class AbstractBookStorage {

    protected Book bookStore;

    public abstract Book store (Book book);

    public abstract boolean remove (Book book);

    public abstract Book get (int id);


}
