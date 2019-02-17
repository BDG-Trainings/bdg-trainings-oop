package com.bdg.master.bookstore.store;


public abstract class Storage {

    protected int storageMaxSize;

    public Storage(final int storageMaxSize) {
        this.storageMaxSize = storageMaxSize;
    }

    protected abstract int currentStorageSize();
}
