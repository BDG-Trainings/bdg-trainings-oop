package com.bdg.bookstorage.vqertikyan.common;

public class BookUpdateParameter {
    private int id;
    private double price;

    public BookUpdateParameter(final int id, final double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookUpdateParameter{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
