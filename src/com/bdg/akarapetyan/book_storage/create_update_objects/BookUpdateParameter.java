package com.bdg.akarapetyan.book_storage.create_update_objects;

public class BookUpdateParameter {

    private int id;
    private double price;

    public BookUpdateParameter(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }
}
