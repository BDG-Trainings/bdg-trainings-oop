package com.bdg.hhertevtsyan.BookStorage;

public class BookStorage extends AbstractBookStorage {
    private int currentStorageSize;

    protected BookStorage(int storageSize) {
        super(storageSize);
    }

    @Override
    public Book store(Book book) {
        Book [] newBookStore = new Book[storageSize+1];
        for (int i=0; i< storageSize+1; i=i+1) {
            newBookStore[i]=bookStore[i];
        }
        newBookStore[storageSize] = book;
        storageSize = storageSize+1;
        return book;
    }

    @Override
    public boolean remove(Book book) {
        boolean isRemoved = false;
        for (int k = 0; k < storageSize; k = k + 1) {
            if (bookStore[k].getId() == book.getId()) {
                int t = 0;
                Book[] newBookStore = new Book[storageSize - 1];
                for (int i = 0; i < storageSize; i = i + 1) {
                    if (bookStore[i].getId() != book.getId()) {
                        newBookStore[t] = bookStore[i];
                        t = t + 1;
                    }
                }
                storageSize = storageSize - 1;
                isRemoved = true;
            }
        }
        return isRemoved;
    }


    @Override
    public Book get(int id) {
        for (int i = 0; i<storageSize; i = i+1) {
            if (bookStore[i].getId() == id) {
               return bookStore[i];
            }
        }
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
