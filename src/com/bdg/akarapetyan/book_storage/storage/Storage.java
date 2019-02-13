package com.bdg.akarapetyan.book_storage.storage;

import com.sun.glass.ui.Size;

public abstract class Storage {

    protected int size;

    protected Storage (int storageSize){
        this.size = storageSize;
    }

    public abstract int getCurrentStorageSize();

}
