package com.bdg.spapoyan.BookStorage;

public class BookCreateParameter {

    private String name;
    private String title;
    private double price;
    private AuthorCreateParameter [] author;

    public BookCreateParameter(final String name, final String title, final double price, AuthorCreateParameter[] author) {
        this.name = name;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public AuthorCreateParameter[] getAuthor() {
        return author;
    }
}
