package BookStorage.Storage;


import BookStorage.Book;

public final class BookStorage extends AsbstractBookStorage{

    private int currentStorageSiz;

    public BookStorage(int currentStorageSiz) {
        this.currentStorageSiz = currentStorageSiz;
    }

    @Override
    public Book store(Book book) {
        return null;
    }

    @Override
    public boolean remove(Book book) {
        return false;
    }

    @Override
    public Book get(int id) {
        return null;
    }
}
