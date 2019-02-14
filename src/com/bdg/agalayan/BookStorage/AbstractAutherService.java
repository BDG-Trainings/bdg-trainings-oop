package BookStorage;

public abstract class AbstractAutherService {

     public  abstract Author get(int id);

     public abstract Author create(AuthorCreateParameter parameter);

     public abstract Author update(AuthorUpdateParameter parameter);

     public abstract boolean delete(int id);

}
