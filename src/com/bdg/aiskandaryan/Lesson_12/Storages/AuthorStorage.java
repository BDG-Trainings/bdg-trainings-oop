package com.bdg.aiskandaryan.Lesson_12.Storages;

import com.bdg.aiskandaryan.Lesson_12.Author;

public class AuthorStorage extends AbstractAuthorStorage {

    private int currentStorageSize;

    public AuthorStorage(final int storageSize) {
        this.currentStorageSize = storageSize;
        this.authorStore = new Author[currentStorageSize];
    }

    @Override
    public Author store(final Author author) {
        Author [] newStorage = new Author[currentStorageSize + 1];
        for (int i = 0; i < currentStorageSize; i++) {
            newStorage[i] = authorStore[i];
        }
        newStorage[currentStorageSize] = author;
        authorStore = newStorage;
        currentStorageSize++;
        return author;
    }

    @Override
    public boolean remove(final Author author) {
        if (currentStorageSize > 0){
            Author [] newStorage = new Author[currentStorageSize - 1];
            int deltaIndex = 0;
            for (int i = 0; i < currentStorageSize; i++) {
                if (authorStore[i + deltaIndex].getId() == author.getId()) {
                    deltaIndex = 1;
                }
                newStorage[i] = authorStore[i + deltaIndex];
            }
            if (deltaIndex != 0) {
                authorStore = newStorage;
                currentStorageSize--;
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
        for (int i = 0; i < currentStorageSize; i++) {
            if (authorStore[i].getId() == id) {
                return authorStore[i];
            }
        }
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
