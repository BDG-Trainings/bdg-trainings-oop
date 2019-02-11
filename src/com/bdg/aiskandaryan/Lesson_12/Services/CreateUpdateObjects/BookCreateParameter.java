package com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects;

public class BookCreateParameter {
    private String title;
    private double price;
    private AuthorCreateParameter [] authors;

    public BookCreateParameter(final String title, final double price, final AuthorCreateParameter[] authors) {
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public AuthorCreateParameter[] getAuthors() {
        return authors;
    }
}
