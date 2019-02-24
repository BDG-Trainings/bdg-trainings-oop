package com.bdg.bookstorage.vqertikyan;

import com.bdg.bookstorage.vqertikyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vqertikyan.common.BookCreateParameter;
import com.bdg.bookstorage.vqertikyan.common.Gender;
import com.bdg.bookstorage.vqertikyan.service.AuthorServiceImpl;
import com.bdg.bookstorage.vqertikyan.service.BookServiceImpl;

public class Application {

    public static void main(String[] args) {

        AuthorServiceImpl authorService = new AuthorServiceImpl();

        AuthorCreateParameter author1 = new AuthorCreateParameter("Mark", "Twain", Gender.MALE);
        AuthorCreateParameter[] authors1 = new AuthorCreateParameter[1];
        authors1[0] = author1;
        authorService.create(author1);
        BookServiceImpl bookService = new BookServiceImpl();
        BookCreateParameter book1 = new BookCreateParameter("The Adventures of Tom Sayer", 5000, authors1);
        bookService.create(book1);
    }
}
