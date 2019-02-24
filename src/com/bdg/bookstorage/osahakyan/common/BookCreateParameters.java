package com.bdg.bookstorage.osahakyan.common;

public class BookCreateParameters {

    private String name;
    private String title;
    private double price;
    private AuthorCreateParameters[] authorCreateParameters;

    public BookCreateParameters(final String name, final String title, final double price, final AuthorCreateParameters[] authorCreateParameters){
        this.name = name;
        this.title = title;
        this.price = price;
        this.authorCreateParameters = authorCreateParameters;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public AuthorCreateParameters[] getAuthorCreateParameters(){
        return authorCreateParameters;
    }
    public void setAuthorCreateParameters(AuthorCreateParameters[] authorCreateParameters) {
        this.authorCreateParameters = authorCreateParameters;
    }
}
