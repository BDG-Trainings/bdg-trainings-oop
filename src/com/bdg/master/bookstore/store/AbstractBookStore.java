package com.bdg.master.bookstore.store;


import com.bdg.master.bookstore.book.Book;

public abstract class AbstractBookStore extends Storage {

    protected Book[] books;

    public AbstractBookStore(int maxStoreSize) {
        super(maxStoreSize);
        this.books = new Book[storageMaxSize];
    }

    public abstract boolean store(Book book);

    public abstract boolean remove(long id);

    public abstract void edit(long id, Book modifiedBook);

    public abstract Book get(long id);

}
