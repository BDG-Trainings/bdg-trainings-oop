package com.bdg.hhertevtsyan.BookStorage.services;

import com.bdg.hhertevtsyan.BookStorage.Author;
import com.bdg.hhertevtsyan.BookStorage.AuthorStorage;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.AuthorCreateParameter;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.AuthorUpdateParameter;

public class AuthorService extends AbstarctAuthorService {
    private AuthorStorage authorStorage;

    public AuthorService (final AuthorStorage authorStorage) {
        this.authorStorage = authorStorage;
    }
    @Override
    public Author get(final int id) {
        Author result = null;
        Author[] newAuthorStorage = new Author[authorStorage.getCurrentStorageSize()];
        for (int i = 0; i < authorStorage.getCurrentStorageSize(); i = i + 1) {
            if (newAuthorStorage[i].getId() == id)
                result = newAuthorStorage[i];
        }
        return result;
    }

    @Override
    public Author create(AuthorCreateParameter params) {
        //Author newAuthor = AuthorCreateParameter.
       // authorStorage.store()
        return null;
    }

    @Override
    public Author update(AuthorUpdateParameter params) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
