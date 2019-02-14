package BookStorage;

public final class BookStorage extends AbstractBookStorage {
    private int currentStorageSize=0;
    public BookStorage(int StorageSize){
        super(StorageSize);
    }    public int getCurrentStorageSize(){
        return currentStorageSize;    }
    @Override
    public boolean store(Book book) {
        if (currentStorageSize < bookStore.length) {
           bookStore[currentStorageSize] = book;
           currentStorageSize++;
           return true;                }
                return false;            }
    @Override
    public Book get ( int id){
        for (int i = 0; i < bookStore.length; i++) {
           if (bookStore[i].getId() == id) {
           return bookStore[i];           }
        }        return null;    }
    @Override
    public boolean remove (Book book) {
        int index=-1;
        for(int i =0; i<bookStore.length; i++){
            if(bookStore[i]==book){
                index=i;            }
        }if(index==-1){           return false;        }
        Book[] books = new Book[bookStore.length-1];
        for(int i = 0; i< bookStore.length; i++){
            if(bookStore[i]!=book){
                books[i]=bookStore[i];            }
        }
        this.bookStore=books;
        return true;
    }
    }