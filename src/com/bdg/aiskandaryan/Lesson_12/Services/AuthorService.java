package com.bdg.aiskandaryan.Lesson_12.Services;

import com.bdg.aiskandaryan.Lesson_12.Author;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorUpdateParameter;
import com.bdg.aiskandaryan.Lesson_12.Storages.AuthorStorage;

public class AuthorService extends AbstractAuthorService {
    private AuthorStorage authorStorage;

    public AuthorService(final AuthorStorage authorStorage) {
        this.authorStorage = authorStorage;
    }

    @Override
    public Author get(final int id) {
        return authorStorage.get(id);
    }

    @Override
    public Author create(final AuthorCreateParameter params) {
        Author author = new Author(authorStorage.getCurrentStorageSize() + 1, params.getName(), params.getSurname(), params.isGender());
        return authorStorage.store(author);
    }

    @Override
    public Author update(final AuthorUpdateParameter params) {
        Author author = authorStorage.get(params.getId());
        author.setName(params.getName());
        author.setSurname(params.getSurname());
        return author;
    }

    @Override
    public boolean delete(final int id) {
        return authorStorage.remove(authorStorage.get(id));
    }
}
