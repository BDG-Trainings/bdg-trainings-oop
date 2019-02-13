package BookStorage.Services;

import BookStorage.Author;
import BookStorage.CRUD.AuthorCreateParameter;
import BookStorage.CRUD.AuthorUpdateParameter;
import BookStorage.Storage.*;

public final class AuthorService extends AbstractAuthorService {

    private AuthorStorage authorStorage;

    @Override
    public Author get(int id) {
        return null;
    }

    @Override
    public Author create(AuthorCreateParameter params) {
        Author author = new Author(params.getName(), params.getSurname(), params.getGender());
        return author;
    }

    @Override
    public Author update(AuthorUpdateParameter params) {

        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
