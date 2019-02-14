package BookStorage;

public abstract class AbstractAutherStorage extends Storage{
    protected Author [] autherStore;

    public  AbstractAutherStorage(int storageMaxSize){
        super(storageMaxSize);
        this.autherStore = new Author[storageMaxSize];
    }

    public abstract Author store(Author author);

    public abstract boolean remove(Author author);

    public abstract Author get(int id);
    protected int getCurrentStorageSize(){
        return autherStore.length;

    }

}
