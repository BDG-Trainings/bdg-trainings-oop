package com.bdg.agalayan.BookStorage.Storage;

public abstract class Storage {
    protected int storageMaxSize;

    protected Storage(int storageMaxSize){
        this.storageMaxSize=storageMaxSize;

    }
protected abstract int getCurrentStorageSize();
}

