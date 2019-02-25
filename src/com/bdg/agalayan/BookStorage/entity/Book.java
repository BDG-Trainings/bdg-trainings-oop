package com.bdg.agalayan.BookStorage.entity;

public class Book {
    private int id;
    private double price;
    private String name;
    private Author[] authors;


    public Book(int id, String name, double price, Author[] authors) {
        this.id = id;
        this.name=name;
        this.price = price;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author []getAuthors() {
        return authors;
    }

    public void setAuthors(Author [] author) {
        this.authors=author;
    }
}







