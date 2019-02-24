package com.bdg.bookstorage.ekirakosyan;

import com.bdg.bookstorage.ekirakosyan.common.Gender;
import com.bdg.bookstorage.ekirakosyan.entity.Author;
import com.bdg.bookstorage.ekirakosyan.entity.Book;

public class Application {

    public static void main(String[] args) {

        Author author1 = new Author(1, "Joe", "Doe", Gender.MALE);
        Author author2 = new Author(2, "Jana", "Booth", Gender.FEMALE);
        Author[] authors = {author1, author2};


        Book book = new Book(1, "Book 1", "Title Here", 5.00, authors);

        System.out.println(book);

    }

}
