package com.bdg.bookstorage.aghazaryan.common;

public class BookCreateParameter {

    private String name;
    private String title;
    private int price;

    public BookCreateParameter(String name, String title, int price) {
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

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookCreateParameter{" +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}