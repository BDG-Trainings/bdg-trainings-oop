package com.bdg.akarapetyan.book_storage.storage;

import com.sun.glass.ui.Size;

public abstract class Storage {

    protected int Size;

    protected Storage (int storageSize){
        this.Size = storageSize;
    }

    public abstract int getCurrentStorageSize();

}
