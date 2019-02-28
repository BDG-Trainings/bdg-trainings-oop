package com.bdg.bookstorage.aghazaryan.storage;
import com.bdg.bookstorage.aghazaryan.service.AuthorServiceImpl;

public class AuthorStorage extends AuthorServiceImpl{

    private int currentStorageSize;


    public AuthorStorage(int currentStorageSize){
        this.currentStorageSize = currentStorageSize;

    }

    public int getCurrentStorageSize(){
        return currentStorageSize;
    }

    public void setCurrentStorageSize(int currentStorageSize) {
        this.currentStorageSize = currentStorageSize;
    }

    @Override
    public String toString() {
        return "AuthorStorage{" +
                "currentStorageSize=" + currentStorageSize +
                '}';
    }
}