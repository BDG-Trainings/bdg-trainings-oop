package BookStorage;

public final class AuthorStorage extends AbstractAutherStorage {
private Author[ ] authors;

    public AuthorStorage(int StorageMaxSize) {
        super(StorageMaxSize);
        authors = new Author[StorageMaxSize];

    }
    @Override
    public Author store(Author author) {
        Author []author1= new Author[autherStore.length+1];
        for (int i=0; i<autherStore.length; i++) {
            author1[i] = autherStore[i];
        }author1[autherStore.length+1]=author;

        return author;
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


}
