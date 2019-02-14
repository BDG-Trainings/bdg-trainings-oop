package BookStorage;

public abstract class AbstractBookStorage extends Storage{
            protected Book [] bookStore = new Book[10];

        public AbstractBookStorage(int storageMaxSize){
            super(storageMaxSize);
            this.bookStore= new Book[storageMaxSize];

        }

        public abstract boolean store(Book book);

        public abstract boolean remove(Book book);

        public abstract Book get(int id);

    }





