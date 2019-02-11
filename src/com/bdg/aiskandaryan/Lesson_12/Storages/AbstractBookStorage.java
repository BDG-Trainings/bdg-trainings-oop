package com.bdg.aiskandaryan.Lesson_12.Storages;

import com.bdg.aiskandaryan.Lesson_12.Book;

public abstract class AbstractBookStorage extends Storage {
    protected Book[] bookStore;

    public abstract Book store(final Book book);

    public abstract boolean remove(final Book book);

    public abstract Book get(final int id);
}
