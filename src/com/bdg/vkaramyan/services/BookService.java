package com.bdg.vkaramyan.services;

import com.bdg.vkaramyan.createUpdateObject.AuthorCreateParameter;
import com.bdg.vkaramyan.createUpdateObject.BookCreateParameter;
import com.bdg.vkaramyan.createUpdateObject.BookUpdateParameter;
import com.bdg.vkaramyan.entitys.Author;
import com.bdg.vkaramyan.entitys.Book;
import com.bdg.vkaramyan.storage.BookStorage;

public final class BookService extends AbstractBookService {
	
	private BookStorage bookStorage;
	private AuthorService authorService = new AuthorService();
	
	public BookService(BookStorage bookStorage) {
		super();
		this.bookStorage = bookStorage;
		
	}

	@Override
	public Book get(int id) {
		// TODO Auto-generated method stub
		return bookStorage.get(id);
	}

	@Override
	public Book create(BookCreateParameter params) {
		final Author[] authors = new Author[params.getAuthors().length];
        int i = 0;
        for (AuthorCreateParameter p : params.getAuthors()) {
            authors[i] = authorService.create(p);
            i++;
        }
        return new Book(bookStorage.getCurrentStorageSize() + 1, params.getName(), params.getTitle(), params.getPrice(), authors);
	}

	@Override
	public Book update(BookUpdateParameter params) {
		final Book book = bookStorage.get(params.getId());
        if (book != null) {
            book.setPrice(params.getPrice());
            return book;
        }
		return null;
	}

	@Override
	public boolean delete(int id) {
		final Book book = bookStorage.get(id);
        return bookStorage.remove(book);
	}
	
	

}
