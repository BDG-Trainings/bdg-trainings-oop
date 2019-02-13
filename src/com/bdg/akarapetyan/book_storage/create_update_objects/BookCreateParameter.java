package com.bdg.akarapetyan.book_storage.create_update_objects;

public class BookCreateParameter {

    private String name;
    private String title;
    private double price;
    private AuthorCreateParameter [] authors;

    public BookCreateParameter(String name, String title, double price, AuthorCreateParameter[] authors) {
        this.name = name;
        this.title = title;
        this.price = price;
        this.authors = authors;
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

    public AuthorCreateParameter[] getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorCreateParameter[] authors) {
        this.authors = authors;
    }
}
