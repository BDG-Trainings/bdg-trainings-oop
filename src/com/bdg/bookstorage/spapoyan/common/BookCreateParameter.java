package com.bdg.bookstorage.spapoyan.common;

import java.util.Arrays;

public class BookCreateParameter {

    private int id;
    private String name;
    private double price;
    private AuthorCreateParameter [] authorCreateParameters;

    public BookCreateParameter(final int id, final String name, final double price, final AuthorCreateParameter[] authorCreateParameters) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.authorCreateParameters = authorCreateParameters;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public AuthorCreateParameter[] getAuthorCreateParameters() {
        return authorCreateParameters;
    }

    public void setAuthorCreateParameters(AuthorCreateParameter[] authorCreateParameters) {
        this.authorCreateParameters = authorCreateParameters;
    }

    @Override
    public String toString() {
        return "BookCreateParameter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", authorCreateParameters=" + Arrays.toString(authorCreateParameters) +
                '}';
    }
}
