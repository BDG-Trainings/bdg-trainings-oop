package com.bdg.bookstorage.osahakyan.common;

public class BookCreateParameters {

    private String name;
    private String title;
    private double price;

    public BookCreateParameters(final String name, final String title, final double price){
        this.name = name;
        this.title = title;
        this.price = price;
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

    
}
