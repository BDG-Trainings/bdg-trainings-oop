package com.bdg.osahakyan.bookstore.createupdateobjects;

public class BookUpdateParameters {

    private int id;
    private double price;

    public BookUpdateParameters(final int id, final double price){
        this.id = id; this.price = price;
    }

    public int getID(){return id;}
    public double getPrice(){return price;}

}
