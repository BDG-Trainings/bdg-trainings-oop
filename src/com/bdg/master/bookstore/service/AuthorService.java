package com.bdg.master.bookstore.service;


import com.bdg.master.bookstore.author.Author;
import com.bdg.master.bookstore.parameters.AuthorCreateParameters;
import com.bdg.master.bookstore.parameters.AuthorEditParameters;
import com.bdg.master.bookstore.store.AuthorStore;

public final class AuthorService extends AbstractAuthorService {

    private AuthorStore authorStore;

    @Override
    public Author create(final AuthorCreateParameters parameters) {

        final Author author = new Author(parameters.getName(), parameters.getSurname(), parameters.getGender());
        return authorStore.store(author);
    }

    @Override
    public Author edit(final AuthorEditParameters parameters) {
        return null;
    }
}
