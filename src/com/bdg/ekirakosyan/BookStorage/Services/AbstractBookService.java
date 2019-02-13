package BookStorage.Services;

import BookStorage.Book;
import BookStorage.CRUD.BookCreateParameter;

public abstract class AbstractBookService {

    public abstract Book get(int id);
    public abstract Book create(BookCreateParameter params);
    public abstract Book update(BookCreateParameter params);
    public abstract boolean delete(int id);

}
