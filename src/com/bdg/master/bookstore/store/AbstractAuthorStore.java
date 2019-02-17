package com.bdg.master.bookstore.store;


import com.bdg.master.bookstore.author.Author;

public abstract class AbstractAuthorStore extends Storage {

    protected Author[] authors;

    protected AbstractAuthorStore(final int authorStoreMaxSize) {
        super(authorStoreMaxSize);
        this.authors = new Author[storageMaxSize];
    }

    public abstract Author store(Author author);

    public abstract Author[] store(Author[] author);

    public abstract Author get(final int id);

    @Override
    protected int currentStorageSize() {
        return authors.length;
    }
}
