package com.bdg.agalayan.BookStorage.common;

public class BookCreateParameter {
        private String name;
        private double price;
        private AuthorCreateParameter[] authors;

        public BookCreateParameter(String name, double price, AuthorCreateParameter[] authors) {
            this.name =name;
            this.price = price;
            this.authors=authors;

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

    public AuthorCreateParameter[] getAuthors() {
              return authors;
        }

    public void setAuthors(AuthorCreateParameter[] authors) {
        this.authors = authors;
    }
}

