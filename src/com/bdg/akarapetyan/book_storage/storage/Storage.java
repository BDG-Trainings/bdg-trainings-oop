package com.bdg.akarapetyan.book_storage.storage;

public abstract class Storage {

    protected int size;

    protected Storage (int storageSize){
        this.size = storageSize;
    }

    public abstract int getCurrentStorageSize();

}
