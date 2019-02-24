package com.bdg.bookstorage.ekirakosyan.common;
import java.util.Arrays;

public class BookCreateParameter {

    private String name;
    private double price;
    private AuthorCreateParameter[] authorCreateParameters;

    public BookCreateParameter(final String name, final double price, final AuthorCreateParameter[] authorCreateParameters) {
        this.name = name;
        this.price = price;
        this.authorCreateParameters = authorCreateParameters;
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
                "name='" + name + '\'' +
                ", price=" + price +
                ", authorCreateParameters=" + Arrays.toString(authorCreateParameters) +
                '}';
    }
}
