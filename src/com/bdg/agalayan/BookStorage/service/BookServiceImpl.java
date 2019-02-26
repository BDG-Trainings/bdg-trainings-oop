package com.bdg.agalayan.BookStorage.service;

import com.bdg.agalayan.BookStorage.Storage.BookStorage;
import com.bdg.agalayan.BookStorage.common.AuthorCreateParameter;
import com.bdg.agalayan.BookStorage.common.BookCreateParameter;
import com.bdg.agalayan.BookStorage.common.BookUpdateParameter;
import com.bdg.agalayan.BookStorage.common.Gender;
import com.bdg.agalayan.BookStorage.entity.Author;
import com.bdg.agalayan.BookStorage.entity.Book;

public class BookServiceImpl implements BookService {
    private AuthorService authorService;
    private BookStorage bookStorage;


    public BookServiceImpl(AuthorService authorService, BookStorage storage) {
        this.authorService = authorService;
        this.bookStorage = storage;

    }

    @Override
    public Book get(int id) {
        for (int i = 0; i < bookStorage.getCurrentStorageSize(); i++) {
            bookStorage.setCurrentStorageSize(id);
        }

        return null;
    }

    @Override
    public Book create(BookCreateParameter bookCreateParameter) {
        AuthorCreateParameter authorCreateParameter = new AuthorCreateParameter("anun6", "azganun6", Gender.FEMALE);

        Author[] a = new Author[1];
        a[0]=authorService.create(authorCreateParameter);
        //need to create Authors using Author service and bookCreateParameter.getAuthors()
        if (bookStorage.getCurrentStorageSize() < bookStorage.getBookStore().length) {

            Book b = new Book(1, bookCreateParameter.getName(), bookCreateParameter.getPrice(), a);
            bookStorage.store(new Book(1, bookCreateParameter.getName(), bookCreateParameter.getPrice(), a));
            return b;
        }
        return null;
    }

    @Override
    public Book update(BookUpdateParameter bookUpdateParameter) {
        for (int i = 0; i < bookStorage.getBookStore().length; i++) {

                Author[] a = new Author[2];

                a[0] = new Author(1, "name", "surname", Gender.FEMALE);

                Book book = new Book(1, bookUpdateParameter.getName(), bookUpdateParameter.getPrice(), a);
                bookStorage.getBookStore()[i] = book;



        }
        return null;

    }

    @Override
    public boolean delete(int id) {
        Book book = this.get(id);
        return book != null && this.bookStorage.remove(book);
    }
}
