package com.bdg.bookstorage.npetrosyan.common;

public final class BookCreateParameter {

    private String name;
    private String title;
    private double price;

    public BookCreateParameter(String name, String title, double price) {
        this.name = name;
        this.title = title;
        this.price = price;
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
}