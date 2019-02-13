package BookStorage.Storage;

import BookStorage.Author;

public abstract class AsbstractAuthorStorage {

    protected Author authorStore;

    public abstract Author store(Author author);
    public abstract boolean remove(Author author);
    public abstract Author get(int id);

}
