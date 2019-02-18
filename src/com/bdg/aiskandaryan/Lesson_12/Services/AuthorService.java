package com.bdg.aiskandaryan.Lesson_12.Services;

import com.bdg.aiskandaryan.Lesson_12.Author;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorUpdateParameter;
import com.bdg.aiskandaryan.Lesson_12.Storages.AuthorStorage;

public class AuthorService extends AbstractAuthorService {
    private AuthorStorage authorStorage;

    public AuthorService() {
        this.authorStorage = new AuthorStorage(0);
    }

    public AuthorService(final AuthorStorage authorStorage) {
        this.authorStorage = authorStorage;
    }

    @Override
    public Author get(final int id) {
        return authorStorage.get(id);
    }

    @Override
    public Author create(final AuthorCreateParameter params) {
        Author author = new Author(authorStorage.getCurrentStorageSize(), params.getName(), params.getSurname(), params.isGender());
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

    public static void main(String[] args) {

        AuthorService authorService = new AuthorService();
        authorService.create(new AuthorCreateParameter("Author0F", "Author0L", true));
        authorService.create(new AuthorCreateParameter("Author1F", "Author1L", false));
        authorService.create(new AuthorCreateParameter("Author2F", "Author2L", true));
        authorService.create(new AuthorCreateParameter("Author3F", "Author3L", false));
        authorService.create(new AuthorCreateParameter("Author4F", "Author4L", true));
        System.out.println(authorService.get(0).getName());
        System.out.println(authorService.get(1).getName());
        System.out.println(authorService.get(2).getName());
        System.out.println(authorService.get(3).getName());
        System.out.println(authorService.get(4).getName());
    }
}
