package com.bdg.osahakyan.bookstore.storage;

public abstract class Storage {

    protected int storageSize;

    protected Storage(final int storageSize){}    //?
    public abstract int getCurrentStorageSize();
}
