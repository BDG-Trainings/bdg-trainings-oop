package com.bdg.vkaramyan.createUpdateObject;

import com.bdg.vkaramyan.entitys.Author;

public class AuthorCreateParameter {

	private Author author = new Author("male", "Stiven", "King", 5);

	public AuthorCreateParameter(Author author) {
		super();
		this.author = author;
		
		
	}

	public Author getAuthor() {
		return author;
	}


}
