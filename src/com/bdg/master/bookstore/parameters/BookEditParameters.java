package com.bdg.master.bookstore.parameters;


public final class BookEditParameters {

    private String title;
    private double bookPrice;

    public BookEditParameters(final String title, final double bookPrice) {
        this.title = title;
        this.bookPrice = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public double getBookPrice() {
        return bookPrice;
    }
}
