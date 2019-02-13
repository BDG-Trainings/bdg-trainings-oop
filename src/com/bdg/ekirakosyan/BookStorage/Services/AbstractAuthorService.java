package BookStorage.Services;

import BookStorage.Author;
import BookStorage.CRUD.AuthorCreateParameter;
import BookStorage.CRUD.AuthorUpdateParameter;


public abstract class AbstractAuthorService {

    public abstract Author get(int id);
    public abstract Author create(AuthorCreateParameter params);
    public abstract Author update(AuthorUpdateParameter params);
    public abstract boolean delete(int id);

}
