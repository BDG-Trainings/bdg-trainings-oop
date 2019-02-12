package com.bdg.vqertikyan.bookstorage.createupdateobjects;

public class BookUpdateParameters {
    private int id;
    private double price;

    public BookUpdateParameters(int id, double price){
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
