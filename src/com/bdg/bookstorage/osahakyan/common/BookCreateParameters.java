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

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public AuthorCreateParameters[] getAuthorCreateParameters(){
        return authorCreateParameters;
    }


}
