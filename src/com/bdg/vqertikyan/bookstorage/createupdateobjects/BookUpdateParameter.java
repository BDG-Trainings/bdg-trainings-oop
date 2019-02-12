package com.bdg.vqertikyan.bookstorage.createupdateobjects;

public class BookUpdateParameter {
    private int id;
    private double price;

    public BookUpdateParameter(int id, double price){
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
