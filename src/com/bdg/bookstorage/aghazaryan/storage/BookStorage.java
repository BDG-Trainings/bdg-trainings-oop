package com.bdg.bookstorage.aghazaryan.storage;

import com.bdg.bookstorage.aghazaryan.service.BookServiceImpl;

public class BookStorage extends BookServiceImpl {

    private int currentStorageSize;

    public BookStorage(int currentStorageSize){
        this. currentStorageSize= currentStorageSize;

    }

    public void setCurrentStorageSize(int currentStorageSize)
    {
        this.currentStorageSize = currentStorageSize;
    }

    public int getCurrentStorageSize() {

        return currentStorageSize;
    }


    @Override
    public String toString() {
        return "BookStorage{" +
                "currentStorageSize=" + currentStorageSize +
                '}';
    }

}


