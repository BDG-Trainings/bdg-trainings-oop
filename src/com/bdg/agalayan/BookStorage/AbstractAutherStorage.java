package BookStorage;

public abstract class AbstractAutherStorage extends Storage{
    protected Author [] autherStore;

    public AbstractAutherStorage(int storageSize){
        super(storageSize);
    }

    public abstract Author[] store(Author author);

    public abstract boolean remove(Author author);

    public abstract Author get(int id);

}
