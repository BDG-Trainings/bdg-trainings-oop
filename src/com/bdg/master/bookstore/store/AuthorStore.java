package com.bdg.master.bookstore.store;


import com.bdg.master.bookstore.author.Author;

public final class AuthorStore extends AbstractAuthorStore {

    private Author[] authors;

    protected AuthorStore(final int authorStoreMaxSize) {
        super(authorStoreMaxSize);
        authors = new Author[storageMaxSize];
    }

    @Override
    public Author store(final Author author) {
        author.setId(currentStorageSize());
        authors[currentStorageSize()] = author;
        return author;
    }

    @Override
    public Author[] store(final Author[] author) {
        Author[] authors = new Author[author.length];
        int i = 0;
        for (Author a : author) {
            authors[i] = this.store(a);
            i++;
        }
        return authors;
    }

    @Override
    public Author get(final int id) {

        for (Author a : authors) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

}
