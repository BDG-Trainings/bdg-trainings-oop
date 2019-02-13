package com.bdg.hhertevtsyan.BookStorage.createupdateobjects;

public class BookCreateParameter {
    private String name;
    private String title;
    private double price;
    private AuthorCreateParameter [] authors;

    public BookCreateParameter (final String name, final String title, final double price, final AuthorCreateParameter [] authors) {
        this.name = name;
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void setAuthors(AuthorCreateParameter[] authors) {
        this.authors = authors;
    }

    public AuthorCreateParameter[] getAuthors() {
        return authors;
    }
}
