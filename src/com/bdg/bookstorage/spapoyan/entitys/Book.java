package com.bdg.bookstorage.spapoyan.entitys;

import java.util.Arrays;

public class Book {

    private int id;
    private String name;
    private String title;
    private double price;
    private Author [] author;

    public Book(int id, String name, String title, double price, Author[] author) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
        this.author = author;
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

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", author=" + Arrays.toString(author) +
                '}';
    }
}