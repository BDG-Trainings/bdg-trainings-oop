package com.bdg.agalayan.BookStorage.common;

public class BookUpdateParameter {
    private int id;
    private String name;
    private double price;

    public BookUpdateParameter(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}


