package com.bdg.master.bookstore.service;


import com.bdg.master.bookstore.author.Author;
import com.bdg.master.bookstore.book.Book;
import com.bdg.master.bookstore.parameters.AuthorCreateParameters;
import com.bdg.master.bookstore.parameters.BookCreateParameters;
import com.bdg.master.bookstore.parameters.BookEditParameters;
import com.bdg.master.bookstore.store.BookStore;

public final class BookService extends AbstractBookService {

    private AuthorService authorService;
    private BookStore bookStore = new BookStore(10);

    public BookService(AuthorService authorService) {
        this.authorService = authorService;
    }


    @Override
    public Book create(final BookCreateParameters params) {
        AuthorCreateParameters[] createParameters = params.getCreateParameters();

        final Author[] authors = new Author[createParameters.length];

        int i = 0;
        for (AuthorCreateParameters acp : createParameters) {
            authors[i] = authorService.create(acp);
            i++;
        }


        final Book book = new Book(params.getTitle(), authors, params.getBookPrice());

        boolean stored = bookStore.store(book);
        if (stored) {
            return book;
        }


        return null;
    }

    @Override
    public Book edit(final BookEditParameters parameters) {
        return null;
    }
}
