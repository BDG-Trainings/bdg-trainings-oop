package BookStorage.Services;

import BookStorage.Book;
import BookStorage.CRUD.BookCreateParameter;
import BookStorage.Storage.*;

public final class BookService extends AbstractBookService {

    private BookStorage bookStorage;
    private AuthorService authorService;

    public BookService(BookStorage bookStorage, AuthorService authorService) {
        this.bookStorage = bookStorage;
        this.authorService = authorService;
    }

    @Override
    public Book get(int id) {
        return bookStorage.get(id);
    }

    @Override
    public Book create(BookCreateParameter params) {
        return null;
    }

    @Override
    public Book update(BookCreateParameter params) {
        return null;
    }

    @Override
    public Book delete(int id) {
        return null;
    }
}
