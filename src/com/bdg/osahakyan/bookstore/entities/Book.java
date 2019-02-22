package com.bdg.osahakyan.bookstore.entities;

import com.bdg.osahakyan.bookstore.entities.Author;

import java.util.Arrays;

public class Book {

    private int id;
    private String title;
    private double price;
    private Author[] authors;

    public Book(final int id, final String title, final double price, final Author[] authors){
        this.id = id;
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public int getID(){return id;}

    public String getTitle(){return title;}

    public double getPrice(){return price;}

    public Author[] getAuthors(){return authors;}

    @Override
    public String toString() {
        return  "Book(  id: " + id +
                ", Title: " + title +
                ", Price: " + price +
                ", Author: " + Arrays.toString(authors) +
                ")";
    }
}
