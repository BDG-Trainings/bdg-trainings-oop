package com.bdg.osahakyan.bookstore.services;

import com.bdg.osahakyan.bookstore.createupdateobjects.AuthorCreateParameters;
import com.bdg.osahakyan.bookstore.createupdateobjects.AuthorUpdateParameters;
import com.bdg.osahakyan.bookstore.entities.Author;

public abstract class AbstractAuthorService {

    public abstract Author get(final int id);
    public abstract Author create(final AuthorCreateParameters params);
    public abstract Author update(final AuthorUpdateParameters params);
    public abstract boolean delete(final int id);

}
