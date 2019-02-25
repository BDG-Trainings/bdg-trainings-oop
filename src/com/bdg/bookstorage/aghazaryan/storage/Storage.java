package com.bdg.bookstorage.aghazaryan.storage;

public abstract class Storage {

    protected int storageSize;



    protected Storage(int storageSize){
        this.storageSize = storageSize;

}

   public int getStorageSize(){
        return storageSize;
    }

    public void setStorageSize(){
        this.storageSize = storageSize;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageSize=" + storageSize +
                '}';
    }


}