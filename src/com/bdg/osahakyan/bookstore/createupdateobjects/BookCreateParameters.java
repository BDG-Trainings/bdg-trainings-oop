package com.bdg.osahakyan.bookstore.createupdateobjects;

public class BookCreateParameters {

    private String name;
    private String title;
    private double price;
    private AuthorCreateParameters[] authors;

    public BookCreateParameters(final String name, final String title, final double price, final AuthorCreateParameters[] authors) {
        this.name = name;
        this.title = title;
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

    @Override
    public String toString() {
        String BookCreateParametersInfo = "BookCreateParameters ~  Name: " + name + ", Title: " + title + ", Price: " + price;
        for (int i = 0; i < authors.length; i++) {
            BookCreateParametersInfo += ", BookCreateParameters" + (i + 1) + ": ";
            BookCreateParametersInfo += authors[i];
            if (i < authors.length - 1) {
                BookCreateParametersInfo += ", ";
            }
        }
        return BookCreateParametersInfo;
    }
}
