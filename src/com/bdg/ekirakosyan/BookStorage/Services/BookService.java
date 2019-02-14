package BookStorage.Services;

import BookStorage.*;
import BookStorage.CRUD.*;
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
        final Author[] authors = new Author[params.getAuthors().length];
        int i = 0;
        for (AuthorCreateParameter p : params.getAuthors()) {  //???
            authors[i] = authorService.create(p);
            i++;
        }

        return new Book(bookStorage.getCurrentStorageSize() + 1, params.getName(), params.getTitle(), params.getPrice(), authors);
    }

    @Override
    public Book update(BookCreateParameter params) {
        final Book book = bookStorage.get(params.getId());
        if (book != null) {
            book.setPrice(params.getPrice());
            return book;
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        final Book book = bookStorage.get(id);
        return bookStorage.remove(book);
    }
}
