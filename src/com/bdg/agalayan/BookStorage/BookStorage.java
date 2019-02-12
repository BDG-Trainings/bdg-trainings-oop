package BookStorage;

public class BookStorage extends AbstractBookStorage {

    private int currentStorageSize;

    public BookStorage(int StorageSize){

        super(StorageSize);
    }
    @Override
    public Book [] store(Book book) {
        Book[]bookstore1= new Book[bookStore.length+1];
        for(int i=0; i<bookStore.length; i++) {
            bookStore[i] = bookstore1[i];
        }bookstore1[bookStore.length+1]=book;
        this.bookStore= bookstore1;
           return bookstore1 ;
    }

    @Override
    public boolean remove(Book book) {
        int index =-1;
        for(int i=0; i<bookStore.length; i++){
            if(bookStore[i]==book){
                index=i;
            }
        }if(index==-1){
            return false;
        }
        Book [] bookstore2 = new Book[bookStore.length-1];
        for(int i = 0; i< bookStore.length; i++){
            if(bookStore[i]!=book){
                bookstore2[i]=bookStore[i];
            }

        }
        this.bookStore=bookstore2;
        return true;
    }

    @Override
    public Book get(int id) {
        for(int i=0; i<bookStore.length; i++){
            if(bookStore[i].getId()==id){
                return bookStore[i];
            }
        }

        return null;
    }

    @Override
    public int getCurrentStorageSize() {
        return currentStorageSize;
    }
}
