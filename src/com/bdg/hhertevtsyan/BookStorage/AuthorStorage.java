package com.bdg.hhertevtsyan.BookStorage;

import com.bdg.hhertevtsyan.BookStorage.entity.Author;

public class AuthorStorage extends AbstractAuthorStorage {
    private int currentStorageSize;
    protected AuthorStorage(int storageSize) {
        super(storageSize);
    }

    @Override
    public Author store(Author author) {
        currentStorageSize = storageSize+1;
        Author [] newAuthorStorage = new Author [currentStorageSize];
        for (int i = 0; i < storageSize; i = i + 1) {
            newAuthorStorage[i] = authorStore[i];
        }
        newAuthorStorage[currentStorageSize] = author;
        return author;
    }

    @Override
    public boolean remove(Author author) {
        boolean isRemoved = false;
        for (int k = 0; k < storageSize; k = k + 1) {
            if (authorStore[k].getId() == author.getId()) {
                int t = 0;
                Author[] newAuthorStore = new Author[storageSize - 1];
                for (int i = 0; i < storageSize; i = i + 1) {
                    if (authorStore[i].getId() != author.getId()) {
                        newAuthorStore[t] = authorStore[i];
                        t = t + 1;
                    }
                }
                storageSize = storageSize - 1;
                currentStorageSize = storageSize;
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    @Override
    public Author get(int id) {
        for (int i = 0; i<storageSize; i = i+1) {
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
