package com.bdg.bookstorage.aghazaryan.common;

public class BookUpdateParameter {
    private String name;
    private int id;
    private int price;

    public BookUpdateParameter(String name, int id, int price ){
        this.name =name;
        this.id = id;
        this.price = price;

    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}

