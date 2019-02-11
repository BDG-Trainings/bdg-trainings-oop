package com.bdg.aiskandaryan.Lesson_12;

public class Book {
    private int id;
    private String title;
    private double price;
    private Author[] authors;

    public Book(final int id, final String title, final double price, final Author[] authors) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(final Author[] authors) {
        this.authors = authors;
    }
}
