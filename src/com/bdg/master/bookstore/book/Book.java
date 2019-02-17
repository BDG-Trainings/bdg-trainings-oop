package com.bdg.master.bookstore.book;


import com.bdg.master.bookstore.author.Author;

import java.util.Arrays;

public final class Book {

    private long id;
    private String title;
    private Author[] author;
    private double bookPrice;

    public Book(final String title, final Author[] author, final double bookPrice) {
        this.title = title;
        this.author = author;
        this.bookPrice = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public Author[] getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
