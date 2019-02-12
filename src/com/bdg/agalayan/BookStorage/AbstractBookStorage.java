package BookStorage;

public abstract class AbstractBookStorage extends Storage{
            protected Book [] bookStore;

        public AbstractBookStorage(int storageSize){
            super(storageSize);


        }

        public abstract Book [] store(Book book);

        public abstract boolean remove(Book book);

        public abstract Book get(int id);

    }





