package BookStorage;

public class AuthorStorage extends AbstractAutherStorage {
private int currentStorageSize;

    public AuthorStorage(int StorageSize) {
        super(StorageSize);

    }

    @Override
    public Author[] store(Author author) {
        Author[] autherstore1= new Author[autherStore.length+1];
       for(int i =0; i < autherStore.length; i++){
           autherstore1[i]=autherStore[i];

       }autherstore1[autherStore.length+1]=author;
       this.autherStore=autherstore1;
       return autherstore1;
    }

    @Override
    public boolean remove(Author author) {
        int index=-1;
        for(int i =0; i<autherStore.length; i++){
            if(autherStore[i]==author){
                index=i;
            }
        }if(index==-1){
            return false;
        }
        Author[] authorstore2 = new Author[autherStore.length-1];
        for(int i = 0; i< autherStore.length; i++){
            if(autherStore[i]!=author){
                authorstore2[i]=autherStore[i];
            }

        }
        this.autherStore=authorstore2;
        return true;
    }


    @Override
    public Author get(int id) {
        for(int i=0; i< autherStore.length; i++){
            if(autherStore[i].getId()==id){
                return autherStore[i];
            }
        }
        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
