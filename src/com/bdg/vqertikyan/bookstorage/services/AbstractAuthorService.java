package com.bdg.vqertikyan.bookstorage.services;

import com.bdg.vqertikyan.bookstorage.createupdateobjects.AuthorCreateParameters;
import com.bdg.vqertikyan.bookstorage.createupdateobjects.AuthorUpdateParameters;
import com.bdg.vqertikyan.bookstorage.entities.Author;

public abstract class AbstractAuthorService {

    public abstract Author get(int id);
    public abstract Author create(AuthorCreateParameters params);
    public abstract Author update(AuthorUpdateParameters params); //?? book
    public abstract boolean delete(int id);

}
