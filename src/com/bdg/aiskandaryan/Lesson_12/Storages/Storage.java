package com.bdg.aiskandaryan.Lesson_12.Storages;

import com.bdg.aiskandaryan.Lesson_12.Author;

public abstract class Storage {
    protected int storageSize;

/*    public Storage(final int storageSize) {
        this.storageSize = storageSize;
    }*/

    public abstract int getCurrentStorageSize();

}
