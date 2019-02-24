package com.bdg.bookstorage.vqertikyan.common;

import java.util.Arrays;

public class BookCreateParameter {
    private String name;
    private double price;
    private BookCreateParameter[] bookCreateParameters;

    public BookCreateParameter(final String name, final double price, final BookCreateParameter[] bookCreateParameters) {
        this.name = name;
        this.price = price;
        this.bookCreateParameters = bookCreateParameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookCreateParameter[] getBookCreateParameters() {
        return bookCreateParameters;
    }

    public void setBookCreateParameters(BookCreateParameter[] bookCreateParameters) {
        this.bookCreateParameters = bookCreateParameters;
    }

    @Override
    public String toString() {
        return "BookCreateParameter{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", bookCreateParameters=" + Arrays.toString(bookCreateParameters) +
                '}';
    }
}
