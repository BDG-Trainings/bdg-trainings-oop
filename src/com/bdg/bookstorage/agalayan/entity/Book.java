package com.bdg.bookstorage.agalayan.entity;

public class Book {
    private  int id;
    private  String name;
    private  String title;
    private  double price;
    private Author author;

    public Book(int id, String name, String title, double price, Author author){
        this.id=id;
        this.name=name;
        this.price=price;
        this.title=title;
        this.author=author;
    }
}
