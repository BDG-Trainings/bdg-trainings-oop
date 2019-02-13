package com.bdg.akarapetyan.book_storage.services;

import com.bdg.akarapetyan.book_storage.create_update_objects.AuthorCreateParameter;
import com.bdg.akarapetyan.book_storage.create_update_objects.BookUpdateParameter;
import com.bdg.akarapetyan.book_storage.entitys.Author;

public abstract class AbstractAuthorService {

    public abstract Author get (int id);

    public abstract Author create (AuthorCreateParameter params);

    public abstract Author update (BookUpdateParameter params);

    public abstract boolean delete (int id);
}
