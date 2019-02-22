package com.bdg.osahakyan.bookstore.createupdateobjects;

import java.util.Arrays;

public class BookCreateParameters {

    private String title;
    private double price;
    private AuthorCreateParameters[] authors;

    public BookCreateParameters( final String title, final double price, final AuthorCreateParameters[] authors) {
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
    public AuthorCreateParameters[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
       return  "BookCreateParameters( " +
               "Title: " + title +
               ", Price: " + price +
               ", Authors" + Arrays.toString(authors) +
               ")";
    }
}
