package BookStorage;

public abstract class Storage {
    protected int storageMaxSize;

    protected Storage(int storageMaxSize){
        this.storageMaxSize=storageMaxSize;

    }
protected abstract int getCurrentStorageSize();
}

