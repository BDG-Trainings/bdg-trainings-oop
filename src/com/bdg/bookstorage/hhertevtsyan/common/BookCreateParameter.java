package com.bdg.bookstorage.hhertevtsyan.common;

public class BookCreateParameter {
    private String name;
    private double price;
    private AuthorCreateParameter [] authorCreateParameters;

    public BookCreateParameter (final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
}
