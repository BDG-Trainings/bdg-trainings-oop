package com.bdg.master.bookstore.service;


import com.bdg.master.bookstore.author.Author;
import com.bdg.master.bookstore.parameters.AuthorCreateParameters;
import com.bdg.master.bookstore.parameters.AuthorEditParameters;

public abstract class AbstractAuthorService {

    public abstract Author create(AuthorCreateParameters parameters);

    public abstract Author edit(AuthorEditParameters parameters);
}
