package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.osahakyan.common.AuthorCreateParameters;
import com.bdg.bookstorage.vkaramyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vkaramyan.common.BookCreateParameter;
import com.bdg.bookstorage.vkaramyan.common.BookUpdateParameter;
import com.bdg.bookstorage.vkaramyan.common.Gender;
import com.bdg.bookstorage.vkaramyan.entity.Author;
import com.bdg.bookstorage.vkaramyan.entity.Book;

public class BookServiceImpl implements BookService{
	
	private AuthorService authorService;
	
	public BookServiceImpl() {
		this.authorService = new AuthorServiceImpl();
		 
	}

	@Override
	public Book create(final BookCreateParameter createParameter) {
		
		final Author[] authors = new Author[authorCreateParameter.getAuthorCreateParameters().length];

        int i = 0;
        for (AuthorCreateParameter p : authorCreateParameter.getAuthorCreateParameters()) {
            authors[i] = this.authorService.create(p);
            i++;
        }   
            final Book book = new Book(1, authorCreateParameter.getName(), AuthorCreateParameter.getPrice(), authors);


            return null;
        
	}

	@Override
	public Book update(BookUpdateParameter bookUpdateParameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
