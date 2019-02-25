package com.bdg.agalayan.BookStorage.entity;

import com.bdg.agalayan.BookStorage.Storage.AuthorStorage;
import com.bdg.agalayan.BookStorage.Storage.BookStorage;
import com.bdg.agalayan.BookStorage.common.AuthorCreateParameter;
import com.bdg.agalayan.BookStorage.common.BookCreateParameter;
import com.bdg.agalayan.BookStorage.common.BookUpdateParameter;
import com.bdg.agalayan.BookStorage.common.Gender;
import com.bdg.agalayan.BookStorage.service.AuthorService;
import com.bdg.agalayan.BookStorage.service.AuthorServiceImpl;
import com.bdg.agalayan.BookStorage.service.BookServiceImpl;

public class Book {
    private int id;
    private double price;
    private String name;
    private Author[] authors;


    public Book(int id, String name, double price, Author[] authors) {
        this.id = id;
        this.name=name;
        this.price = price;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author []getAuthors() {
        return authors;
    }

    public void setAuthors(Author [] author) {
        this.authors=author;
    }
    @Override
    public String toString(){
        return "Book[name="+getName()+
                ", price="+getPrice() +
                ", authors=" +getAuthors()+"]";

    }
    public static void main(String[]args){
        Author author[]=new Author[2];
        author[0]=new Author(1, "anun1", "azganun1", Gender.FEMALE);
        Book[]b = new Book[3];
        b[0]= new Book(1, "b", 2000,author );
        System.out.println(b.toString());
        System.out.println(b.length);

        BookStorage bookStorage= new BookStorage(10, b);
        AuthorStorage storage=new AuthorStorage(10, author);
        AuthorService authorService= new AuthorServiceImpl(storage);
        BookServiceImpl bookService= new BookServiceImpl(authorService, bookStorage);
        AuthorCreateParameter[] authorCreateParameter= new AuthorCreateParameter[2];
        authorCreateParameter[0]= new AuthorCreateParameter("anun2", "azganun2", Gender.MALE);

        BookCreateParameter bookCreateParameter= new BookCreateParameter("b1", 1000, authorCreateParameter);
        BookUpdateParameter bookUpdateParameter= new BookUpdateParameter(1, "b2", 3000);

        System.out.println(bookService.create(bookCreateParameter));
        System.out.println(bookService.update(bookUpdateParameter));
        System.out.println(authorService.create(authorCreateParameter[0]));
        System.out.println(authorService.get(1));
        System.out.println(bookService.get(2));
        System.out.println(bookStorage.get(2));
        System.out.println(authorService.delete(1));
        System.out.println(bookService.delete(3));
        System.out.println(authorService.delete(2));





    }
}







