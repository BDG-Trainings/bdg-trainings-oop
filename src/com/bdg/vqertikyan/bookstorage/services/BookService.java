package com.bdg.vqertikyan.bookstorage.services;

// idep AuthorService-i mej e gtnvum AuthorStorage-y

import com.bdg.vqertikyan.bookstorage.createupdateobjects.AuthorCreateParameters;
import com.bdg.vqertikyan.bookstorage.createupdateobjects.BookCreateParameters;
import com.bdg.vqertikyan.bookstorage.createupdateobjects.BookUpdateParameters;
import com.bdg.vqertikyan.bookstorage.entities.Author;
import com.bdg.vqertikyan.bookstorage.entities.Book;
import com.bdg.vqertikyan.bookstorage.storage.BookStorage;

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
    public Book create(BookCreateParameters params) {
        final Author[] authors = new Author[params.getAuthors().length];
        int i = 0;
        for (AuthorCreateParameters p : params.getAuthors()) {
            authors[i] = authorService.create(p);
            i++;
        }
        return new Book(storage.getCurrentStorageSize() + 1, params.getName(), params.getTitle(), params.getPrice(), authors);
    }

    @Override
    public boolean delete(int id) {
        final Book book = storage.get(id);
        return storage.remove(book);
    }

    @Override
    public Book update(BookUpdateParameters params) {
        final Book book = storage.get(params.getId());
        if (book != null) {
            book.setPrice(params.getPrice());
            return book;
        }
        return null;
    }
}
