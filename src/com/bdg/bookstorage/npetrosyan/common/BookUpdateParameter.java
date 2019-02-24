package com.bdg.bookstorage.npetrosyan.common;

public class BookUpdateParameter {
    private String name;
    private int id;
    private double price;

    public BookUpdateParameter(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName(String name) {
        return name;
    }

    public int getId(int id) {
        return id;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookUpdateParameter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}



