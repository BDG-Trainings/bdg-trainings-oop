package com.bdg.akarapetyan.book_storage.storage;

import com.bdg.akarapetyan.book_storage.entitys.Author;

public class AuthorStorage extends AbstractAuthorStorage{

    public AuthorStorage(int storageSize, Author[] authorStore) {
        super(storageSize, authorStore);
        this.size = storageSize;
        this.authorStore = new Author[storageSize];
    }

    @Override
    public int getCurrentStorageSize() {
        return size;
    }

    @Override
    public Author store(Author author) {
        return null;
    }

    @Override
    public boolean remove(Author author) {
        return false;
    }

    @Override
    public Author get(int id) {
        return null;
    }
}
