package com.bdg.akarapetyan.book_storage.services;

import com.bdg.akarapetyan.book_storage.create_update_objects.AuthorCreateParameter;
import com.bdg.akarapetyan.book_storage.create_update_objects.BookUpdateParameter;
import com.bdg.akarapetyan.book_storage.entitys.Author;
import com.bdg.akarapetyan.book_storage.storage.AuthorStorage;

public class AuthorService extends AbstractAuthorService{

    AuthorStorage [] authorStorages;

    @Override
    public Author get(int id) {
        return null;
    }

    @Override
    public Author create(AuthorCreateParameter params) {
        return null;
    }

    @Override
    public Author update(BookUpdateParameter params) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}