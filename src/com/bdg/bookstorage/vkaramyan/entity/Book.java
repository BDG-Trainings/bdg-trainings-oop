package com.bdg.bookstorage.vkaramyan.entity;

import java.util.Arrays;

public final class Book {

    private int id;
    private String name;
    private double price;
    private Author[] authors;

    public Book(final int id, final String name, final double price, final Author[] authors) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", price=" + price + ", authors="
                + Arrays.toString(authors) + "]";
    }


}
