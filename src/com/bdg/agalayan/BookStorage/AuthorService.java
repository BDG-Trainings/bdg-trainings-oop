package BookStorage;

public class AuthorService extends AbstractAutherService{
    private AuthorStorage authorStorage;
    public AuthorService(AuthorStorage storage){
        this.authorStorage=storage;    }
    @Override
    public Author get(int id) {
       Author a = authorStorage.get(id);
       return a;    }
    @Override
    public Author create(AuthorCreateParameter parameter) {
        Author a = new Author(20, parameter.getName(),
                parameter.getSurname(), parameter.getGender());
        authorStorage.store(a);
        return a;    }
    @Override
    public Author update(AuthorUpdateParameter parameter) {
    Author b = authorStorage.get(parameter.getId());
    if (authorStorage.remove(b)) {
        Author a1 = new Author(parameter.getId(), parameter.getName(),
            parameter.getSurname(), b.getGender());
        authorStorage.store(a1);
        return a1;    }
    return b;    }
    @Override
    public boolean delete(int id) {
        Author c = authorStorage.get(id);
        boolean t =authorStorage.remove(c);
        return t;    }
}
