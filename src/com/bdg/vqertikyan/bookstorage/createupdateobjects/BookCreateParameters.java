package com.bdg.vqertikyan.bookstorage.createupdateobjects;

public class BookCreateParameters {
    private String name;
    private String title;
    private double price;
    private AuthorCreateParameters[] authors;

    public BookCreateParameters(String name, String title, double price, AuthorCreateParameters[] authors){
        this.name = name;
        this.title =title;
        this.price = price;
        this.authors = authors;
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

    public AuthorCreateParameters[] getAuthors() {
        return authors;
    }
}
