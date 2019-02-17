package com.bdg.master.bookstore.parameters;


public final class BookCreateParameters {

    private String title;
    private AuthorCreateParameters[] createParameters;
    private double bookPrice;

    public BookCreateParameters(final String title, final AuthorCreateParameters[] createParameters, final double bookPrice) {
        this.title = title;
        this.createParameters = createParameters;
        this.bookPrice = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public AuthorCreateParameters[] getCreateParameters() {
        return createParameters;
    }

    public double getBookPrice() {
        return bookPrice;
    }
}
