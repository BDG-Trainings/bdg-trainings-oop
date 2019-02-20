package com.bdg.aiskandaryan.Lesson_12.Services;

import com.bdg.aiskandaryan.Lesson_12.Author;
import com.bdg.aiskandaryan.Lesson_12.Book;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorUpdateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.BookCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.BookUpdateParameter;
import com.bdg.aiskandaryan.Lesson_12.Storages.AuthorStorage;
import com.bdg.aiskandaryan.Lesson_12.Storages.BookStorage;

public class BookService extends AbstractBookService {
    private BookStorage bookStorage;
    private AuthorService authorService;

    public BookService(final BookStorage bookStorage, final AuthorService authorService) {
        this.bookStorage = bookStorage;
        this.authorService = authorService;
    }

    public BookService(final AuthorService authorService) {
        this.bookStorage = new BookStorage(0);
        this.authorService = authorService;
    }

    @Override
    public Book get(final int id) {
        return bookStorage.get(id);
    }

    @Override
    public Book create(final BookCreateParameter params) {
        final Author[] authors = new Author[params.getAuthors().length];
        for (int i = 0; i < params.getAuthors().length; i++) {
            authors[i] = authorService.create(params.getAuthors()[i]);
        }
        Book book = bookStorage.store(new Book(bookStorage.getCurrentStorageSize(), params.getTitle(), params.getPrice(), authors));
        System.out.println("Create a new book with ID - " + book.getId() + " SUCCESS :)");
        return book;
    }

    @Override
    public Book update(final BookUpdateParameter params) {
        Book book = bookStorage.get(params.getId());
        if (book != null) {
            book.setPrice(params.getPrice());
            System.out.println("Update book with ID - " + params.getId() + " SUCCESS :)");
        } else {
            System.out.println("Update book with ID - " + params.getId() + " FAILED :(");
        }
        return book;
    }

    @Override
    public boolean delete(final int id) {
        boolean r = bookStorage.remove(bookStorage.get(id));
        if (r) {
            System.out.println("Remove book with ID - " + id + " SUCCESS :)");
        } else {
            System.out.println("Remove book with ID - " + id + " FAILED :(");
        }
        return r;
    }

    public static void main(String[] args) {

        AuthorService authorService = new AuthorService();
        authorService.create(new AuthorCreateParameter("Author0F", "Author0L", true));
        authorService.create(new AuthorCreateParameter("Author1F", "Author1L", false));
        authorService.create(new AuthorCreateParameter("Author2F", "Author2L", true));
        authorService.create(new AuthorCreateParameter("Author3F", "Author3L", false));
        authorService.create(new AuthorCreateParameter("Author4F", "Author4L", true));

        AuthorCreateParameter authorCreate5 = new AuthorCreateParameter("Author5F", "Author5L", false);
        AuthorCreateParameter authorCreate6 = new AuthorCreateParameter("Author6F", "Author6L", true);
        AuthorCreateParameter authorCreate7 = new AuthorCreateParameter("Author7F", "Author7L", false);
        AuthorCreateParameter[] authors1 = {authorCreate5, authorCreate6};
        AuthorCreateParameter[] authors2 = {authorCreate7};

        BookService bookService = new BookService(new BookStorage(0), authorService);
        bookService.create(new BookCreateParameter("Book #1 Title", 10, authors1));
        bookService.create(new BookCreateParameter("Book #2 Title", 20, authors2));
        System.out.println(bookService.get(0).getTitle() + " " + bookService.get(0).getPrice());
        System.out.println();
        bookService.update(new BookUpdateParameter(0, 15));
        System.out.println(bookService.get(0).getTitle() + " " + bookService.get(0).getPrice());
        bookService.delete(0);
        bookService.delete(1);
        bookService.delete(0);
        bookService.update(new BookUpdateParameter(0, 15));

    }
}
