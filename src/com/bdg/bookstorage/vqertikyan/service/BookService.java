package com.bdg.bookstorage.vqertikyan.service;
import com.bdg.bookstorage.vqertikyan.common.BookCreateParameter;
import com.bdg.bookstorage.vqertikyan.entity.Book;

public interface BookService {

    Book create(BookCreateParameter bookCreateParameter);

    Book update();

    Book delete();

    Book get();

}
