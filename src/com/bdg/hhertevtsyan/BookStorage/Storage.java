package com.bdg.hhertevtsyan.BookStorage;

public abstract class Storage {
protected int storageSize;

protected Storage (final int storageSize) {
    this.storageSize = storageSize;
}

public int getCurrentStorageSize () {
    return storageSize;
}

}
