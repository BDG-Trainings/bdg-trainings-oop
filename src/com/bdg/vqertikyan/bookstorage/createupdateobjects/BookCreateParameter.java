package com.bdg.vqertikyan.bookstorage.createupdateobjects;

public class BookCreateParameter {
    private String name;
    private String title;
    private double price;
    private AuthorCreateParameter[] authors;

    public BookCreateParameter(String name, String title, double price, AuthorCreateParameter[] authors){
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

    public AuthorCreateParameter[] getAuthors() {
        return authors;
    }
}
