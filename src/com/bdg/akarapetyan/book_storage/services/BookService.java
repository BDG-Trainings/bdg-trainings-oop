package com.bdg.akarapetyan.book_storage.services;

import com.bdg.akarapetyan.book_storage.create_update_objects.AuthorCreateParameter;
import com.bdg.akarapetyan.book_storage.create_update_objects.BookCreateParameter;
import com.bdg.akarapetyan.book_storage.create_update_objects.BookUpdateParameter;
import com.bdg.akarapetyan.book_storage.entitys.Author;
import com.bdg.akarapetyan.book_storage.entitys.Book;
import com.bdg.akarapetyan.book_storage.storage.BookStorage;

public final class BookService extends AbstractBookService {

    private BookStorage storage;

    private AuthorService authorService = new AuthorService();

    public BookService(BookStorage storage) {
        this.storage = storage;
    }

    @Override
    public Book get(int id) {
        return storage.get(id);
    }

    @Override
    public Book create(BookCreateParameter params) {
        final Author[] authors = new Author[params.getAuthors().length];
        int i = 0;
        for (AuthorCreateParameter p : params.getAuthors()) {
            authors[i] = authorService.create(p);
            i++;
        }
        return new Book(storage.getCurrentStorageSize() + 1, params.getName(), params.getTitle(), params.getPrice(), authors);
    }

    @Override
    public Book update(BookUpdateParameter params) {
        final Book book = storage.get(params.getId());
        if (book != null) {
            book.setPrice(params.getPrice());
            return book;
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        final Book book = storage.get(id);
        return storage.remove(book);
    }
}
