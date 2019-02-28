package com.bdg.bookstorage.hhertevtsyan.entity;

import java.util.Arrays;

public class Book {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
