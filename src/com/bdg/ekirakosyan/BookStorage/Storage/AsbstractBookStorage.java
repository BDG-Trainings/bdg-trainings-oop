package BookStorage.Storage;

import BookStorage.Book;

public abstract class AsbstractBookStorage {

    protected Book bookStore;

    public abstract Book store(Book book);
    public abstract boolean remove(Book book);
    public abstract Book get(int id);

}
