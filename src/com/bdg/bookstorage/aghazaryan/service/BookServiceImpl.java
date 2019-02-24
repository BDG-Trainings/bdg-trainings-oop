package com.bdg.bookstorage.aghazaryan.service;

public class BookServiceImpl implements BookService{


    private AuthorService AuthorService;

    public BookServiceImpl(AuthorService AuthorService){
        this.AuthorService = AuthorService;
        AuthorServiceImpl AuthImplObj = new AuthorServiceImpl();

    }

}

