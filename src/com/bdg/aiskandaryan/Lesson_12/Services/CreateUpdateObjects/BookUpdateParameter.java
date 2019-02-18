package com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects;

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

    public double getPrice() {
        return price;
    }
}
