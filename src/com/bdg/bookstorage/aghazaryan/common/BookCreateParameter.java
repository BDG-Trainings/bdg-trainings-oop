package com.bdg.bookstorage.aghazaryan.common;

public class BookCreateParameter {

    private String name;
    private int price;

    public BookCreateParameter(String name, String title, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

      public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookCreateParameter{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}