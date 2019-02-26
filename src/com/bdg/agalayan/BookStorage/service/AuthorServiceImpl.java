package com.bdg.agalayan.BookStorage.service;

import com.bdg.agalayan.BookStorage.Storage.AuthorStorage;
import com.bdg.agalayan.BookStorage.common.AuthorCreateParameter;
import com.bdg.agalayan.BookStorage.common.Gender;
import com.bdg.agalayan.BookStorage.entity.Author;

public class AuthorServiceImpl implements AuthorService {
    private AuthorStorage authorStorage;


    public AuthorServiceImpl(AuthorStorage storage){
        this.authorStorage=storage;
    }


    public Author get(int id) {

        return this.authorStorage.get(id);
        }




    @Override
    public Author create(AuthorCreateParameter authorCreateParameter) {
            Author author = new Author(1, authorCreateParameter.getName(), authorCreateParameter.getSurname(),
                    authorCreateParameter.getGender());
        return this.authorStorage.store(author);
        }



    @Override
    public boolean delete(int id) {
        Author author=this.get(id);


        return author!= null && this.authorStorage.remove(author);
    }
}
