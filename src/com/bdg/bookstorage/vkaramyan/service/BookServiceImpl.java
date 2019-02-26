package com.bdg.bookstorage.vkaramyan.service;

import com.bdg.bookstorage.osahakyan.common.AuthorCreateParameters;
import com.bdg.bookstorage.vkaramyan.common.AuthorCreateParameter;
import com.bdg.bookstorage.vkaramyan.common.BookCreateParameter;
import com.bdg.bookstorage.vkaramyan.common.BookUpdateParameter;
import com.bdg.bookstorage.vkaramyan.common.Gender;
import com.bdg.bookstorage.vkaramyan.entity.Author;
import com.bdg.bookstorage.vkaramyan.entity.Book;
import com.bdg.bookstorage.vkaramyan.storage.BookStorageImpl;
import com.bdg.resourcemanagement.vkaramyan.Department;
import com.bdg.resourcemanagement.vkaramyan.Employee;

public class BookServiceImpl implements BookService{
	
	private AuthorService authorService;
	
	public BookServiceImpl() {
		this.authorService = new AuthorServiceImpl();
		 
	}

	@Override
	public Book create(final BookCreateParameter createParameter) {
		
		final Author[] authors = new Author[createParameter.getAuthorCreateParameter().length];

        int i = 0;
        for (AuthorCreateParameter p : createParameter.getAuthorCreateParameter()) {
            authors[i] = this.authorService.create(p);
            i++;
        }   
            final Book book = new Book(1, createParameter.getName(), createParameter.getPrice(), authors);


            return null;
        
	}

	@Override
	public Book update(BookUpdateParameter updateParameter) {
		
		final Book book = new Book(updateParameter.getId(), updateParameter.getName(), updateParameter.getPrice());
		
		if(book != null) {
			book.setPrice(updateParameter.getPrice());
			return book;
		}
		return null;
	}

	@Override
	public boolean delete() {
    		
		return false;
	}

	@Override
	public Book get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
