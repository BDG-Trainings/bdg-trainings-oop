package com.bdg.agalayan.BookStorage.service;

import com.bdg.agalayan.BookStorage.Storage.AuthorStorage;
import com.bdg.agalayan.BookStorage.common.AuthorCreateParameter;
import com.bdg.agalayan.BookStorage.entity.Author;

public class AuthorServiceImpl implements AuthorService {
    private AuthorStorage authorStorage;

    public AuthorServiceImpl(AuthorStorage storage){
        this.authorStorage=storage;
    }


    public Author get(int id) {
        for(int i=0; i<authorStorage.authors.length; i++ ){
            if(authorStorage.authors[i].getId()==id){
                return authorStorage.authors[i];
            }
        }
        return null;
    }


    @Override
    public Author create(AuthorCreateParameter authorCreateParameter) {
        return null;
    }


    @Override
    public Author delete(int id) {
        return null;
    }
}
