package com.bdg.master.bookstore.store;


import com.bdg.master.bookstore.book.Book;

public final class BookStore extends AbstractBookStore {


    private int currentStorageSize = 0;

    public BookStore(final int storeSize) {
        super(storeSize);
    }

    @Override
    public int currentStorageSize() {
        return currentStorageSize;
    }

    @Override
    public boolean store(final Book book) {
        if (currentStorageSize < books.length) {
            books[currentStorageSize] = book;
            currentStorageSize ++;
            return true;
        }
        
        return false;
    }

    @Override
    public boolean remove(final long id) {
        return false;
    }

    @Override
    public void edit(final long id, final Book modifiedBook) {

    }

    @Override
    public Book get(final long id) {
        return null;
    }
}
