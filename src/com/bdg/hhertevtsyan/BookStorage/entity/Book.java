package com.bdg.hhertevtsyan.BookStorage.entity;

public class Book {
    private int id;
    private String name;
    private String title;
    private double price;
    private Author [] authors;

    public Book (final int id, final String name, final String title, final double price, final Author [] authors) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
}
