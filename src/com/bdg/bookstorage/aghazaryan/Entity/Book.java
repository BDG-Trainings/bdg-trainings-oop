package com.bdg.bookstorage.aghazaryan.Entity;

public class Book {

    private int id;
    private String name;
    private double price;
    private Author authors;


    public Book(int id, String name,double price, Author authors ){
        this.id = id;
        this.name = name;
        this.price = price;
        this.authors = authors;


    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}


