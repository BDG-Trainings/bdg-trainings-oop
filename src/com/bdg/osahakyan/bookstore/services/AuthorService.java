package com.bdg.osahakyan.bookstore.services;

import com.bdg.osahakyan.bookstore.storage.AuthorStorage;

public abstract class AuthorService {

    private AuthorStorage authorStorage;

    public AuthorService(final AuthorStorage authorStorage){}

}
