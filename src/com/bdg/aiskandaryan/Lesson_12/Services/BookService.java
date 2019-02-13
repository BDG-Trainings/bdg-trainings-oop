package com.bdg.aiskandaryan.Lesson_12.Services;

import com.bdg.aiskandaryan.Lesson_12.Author;
import com.bdg.aiskandaryan.Lesson_12.Book;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorUpdateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.BookCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.BookUpdateParameter;
import com.bdg.aiskandaryan.Lesson_12.Storages.AuthorStorage;
import com.bdg.aiskandaryan.Lesson_12.Storages.BookStorage;

public class BookService extends AbstractBookService {
    private BookStorage bookStorage;
    private AuthorService authorService;

    public BookService(final BookStorage bookStorage, final AuthorService authorService) {
        this.bookStorage = bookStorage;
        this.authorService = authorService;
    }

    @Override
    public Book get(final int id) {
        return bookStorage.get(id);
    }

    @Override
    public Book create(final BookCreateParameter params) {
        final Author[] authors = new Author[params.getAuthors().length];
        for (int i = 0; i < params.getAuthors().length; i++) {
            authors[i] = authorService.create(params.getAuthors()[i]);
        }
        return new Book(bookStorage.getCurrentStorageSize() + 1, params.getTitle(), params.getPrice(), authors);
    }

    @Override
    public Book update(final BookUpdateParameter params) {
        Book book = bookStorage.get(params.getId());
        if (book != null) {
            book.setPrice(params.getPrice());
        }
        return book;
    }

    @Override
    public boolean delete(final int id) {
        return bookStorage.remove(bookStorage.get(id));
    }
}
