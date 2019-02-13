package com.bdg.aiskandaryan.Lesson_12.Storages;

import com.bdg.aiskandaryan.Lesson_12.Author;

public class AuthorStorage extends AbstractAuthorStorage {


    public AuthorStorage(final int storageSize) {
        this.storageSize = storageSize;
        this.authorStore = new Author[storageSize];
    }

    @Override
    public Author store(final Author author) {
        Author [] newStorage = new Author[storageSize + 1];
        for (int i = 0; i < storageSize; i++) {
            newStorage[i] = authorStore[i];
        }
        newStorage[storageSize] = author;
        authorStore = newStorage;
        storageSize++;
        return author;
    }

    @Override
    public boolean remove(final Author author) {
        if (storageSize > 0){
            Author [] newStorage = new Author[storageSize - 1];
            int deltaIndex = 0;
            for (int i = 0; i < storageSize; i++) {
                if (authorStore[i + deltaIndex].getId() == author.getId()) {
                    deltaIndex = 1;
                }
                newStorage[i] = authorStore[i + deltaIndex];
            }
            if (deltaIndex != 0) {
                authorStore = newStorage;
                storageSize--;
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Author get(final int id) {
        for (int i = 0; i < storageSize; i++) {
            if (authorStore[i].getId() == id) {
                return authorStore[i];
            }
        }
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return storageSize;
    }
}
