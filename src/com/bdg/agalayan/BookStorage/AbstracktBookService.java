package BookStorage;

public abstract class AbstracktBookService {

    public abstract Book get(int id);

    public abstract Book create(BookCreateParameter parameter);

    public abstract Book update(BookUpdateParameter parameter);

    public abstract boolean delete(int id);
}
